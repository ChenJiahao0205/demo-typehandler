package pers.chenjiahao.typehandler.handler;

import org.apache.ibatis.type.*;
import pers.chenjiahao.typehandler.entity.UserInfo;
import pers.chenjiahao.typehandler.util.JsonUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 21:05
 */
@MappedTypes(UserInfo.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class UserInfoTypeHandler extends BaseTypeHandler<UserInfo> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, UserInfo userInfo, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, JsonUtils.toJson(userInfo));
    }

    @Override
    public UserInfo getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return JsonUtils.fromJson(resultSet.getString(columnName),UserInfo.class);
    }

    @Override
    public UserInfo getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return JsonUtils.fromJson(resultSet.getString(columnIndex),UserInfo.class);
    }

    @Override
    public UserInfo getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return JsonUtils.fromJson(callableStatement.getString(columnIndex),UserInfo.class);
    }
}
