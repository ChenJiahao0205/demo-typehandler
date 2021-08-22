package pers.chenjiahao.typehandler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import pers.chenjiahao.typehandler.handler.TeacherLevelEnumTypeHandler;


/**
 * 教师实体类
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 19:04
 */
@Data
@TableName(value = "teacher",autoResultMap = true)
public class Teacher {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    @TableField(value = "teacher_level",typeHandler = TeacherLevelEnumTypeHandler.class)
    private TeacherLevelEnum teacherLevel;
}
