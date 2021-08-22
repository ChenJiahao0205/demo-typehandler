package pers.chenjiahao.typehandler.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import pers.chenjiahao.typehandler.entity.Transcript;
import pers.chenjiahao.typehandler.util.JsonUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 22:24
 */
@MappedTypes(List.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class ListTranscriptTypeHandler extends BaseTypeHandler<List<Transcript>> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<Transcript> transcripts, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,JsonUtils.toJson(transcripts));
    }

    @Override
    public List<Transcript> getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return JsonUtils.fromJsonList(resultSet.getString(columnName),Transcript.class);
    }

    @Override
    public List<Transcript> getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return JsonUtils.fromJsonList(resultSet.getString(columnIndex),Transcript.class);
    }

    @Override
    public List<Transcript> getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return JsonUtils.fromJsonList(callableStatement.getString(columnIndex),Transcript.class);
    }
}
