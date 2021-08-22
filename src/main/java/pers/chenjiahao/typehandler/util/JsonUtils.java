package pers.chenjiahao.typehandler.util;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.lang.reflect.Type;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 21:00
 */
public class JsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();
    private static final Gson GSON = new Gson();

    static {
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        SimpleDateFormat sdf = new SimpleDateFormat();
        objectMapper.setDateFormat(sdf);

    }

    public static String toJson(Object object) {
        if (Objects.isNull(object)) {
            return null;
        }
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException(e);
        }
    }

    public static <T> T fromJson(String json, Class<T> classOfT) {
        return GSON.fromJson(json, classOfT);
    }

    public static <T> List<T> fromJsonList(String json, Class<T> genericTypeOfList) {
        List<T> list = new ArrayList<>();
        JsonArray jsonArray = JsonParser.parseString(json).getAsJsonArray();
        for (JsonElement jsonElement : jsonArray) {
            list.add(GSON.fromJson(jsonElement, genericTypeOfList));
        }
        return list;
    }
}
