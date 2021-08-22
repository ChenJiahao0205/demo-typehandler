package pers.chenjiahao.typehandler.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 学生成绩单
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 22:26
 */
@Data
@Builder
public class Transcript {

    private String subject;

    private Integer score;
}
