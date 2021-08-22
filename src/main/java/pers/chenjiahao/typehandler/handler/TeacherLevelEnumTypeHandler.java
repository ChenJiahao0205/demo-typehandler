package pers.chenjiahao.typehandler.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import pers.chenjiahao.typehandler.entity.TeacherLevelEnum;
import pers.chenjiahao.typehandler.entity.UserInfo;
import pers.chenjiahao.typehandler.util.JsonUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 22:05
 */
@MappedTypes(TeacherLevelEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)
public class TeacherLevelEnumTypeHandler extends BaseTypeHandler<TeacherLevelEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, TeacherLevelEnum teacherLevelEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,teacherLevelEnum.getValue());
    }

    @Override
    public TeacherLevelEnum getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return TeacherLevelEnum.valueOfStr(resultSet.getString(columnName));
    }

    @Override
    public TeacherLevelEnum getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return TeacherLevelEnum.valueOfStr(resultSet.getString(columnIndex));
    }

    @Override
    public TeacherLevelEnum getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return TeacherLevelEnum.valueOfStr(callableStatement.getString(columnIndex));
    }
}
