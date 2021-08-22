package pers.chenjiahao.typehandler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import pers.chenjiahao.typehandler.handler.UserInfoTypeHandler;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 19:34
 */
@Data
@TableName(value = "user",autoResultMap = true)
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    @TableField(value = "user_info",typeHandler = UserInfoTypeHandler.class)
    private UserInfo userInfo;
}
