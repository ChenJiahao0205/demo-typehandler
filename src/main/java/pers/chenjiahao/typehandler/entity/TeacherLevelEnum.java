package pers.chenjiahao.typehandler.entity;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * 教师等级枚举
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 21:53
 */
public enum  TeacherLevelEnum {

    LOW_LEVEL(1),
    MIDDLE_LEVEL(2),
    HIGH_LEVEL(3);

    @EnumValue
    @Getter
    @JsonValue
    private int value;

    @JsonCreator
    TeacherLevelEnum(int value) {
        this.value = value;
    }

    @JsonCreator
    public static TeacherLevelEnum valueOfStr(String value) {
        return Stream.of(TeacherLevelEnum.values()).filter(queryOpType -> Objects.equals(queryOpType.getValue(), Integer.valueOf(value))).findFirst().orElse(null);
    }
}
