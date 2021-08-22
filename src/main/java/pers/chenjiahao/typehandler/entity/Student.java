package pers.chenjiahao.typehandler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import pers.chenjiahao.typehandler.handler.ListTranscriptTypeHandler;

import java.util.List;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 19:02
 */
@Data
@TableName(value = "student",autoResultMap = true)
public class Student {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    @TableField(value = "transcript",typeHandler = ListTranscriptTypeHandler.class)
    private List<Transcript> transcripts;

}
