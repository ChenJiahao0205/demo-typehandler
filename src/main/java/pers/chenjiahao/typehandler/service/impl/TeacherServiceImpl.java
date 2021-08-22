package pers.chenjiahao.typehandler.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.chenjiahao.typehandler.dao.TeacherMapper;
import pers.chenjiahao.typehandler.entity.Teacher;
import pers.chenjiahao.typehandler.service.TeacherService;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 19:41
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
}
