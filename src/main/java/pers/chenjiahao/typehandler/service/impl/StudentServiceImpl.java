package pers.chenjiahao.typehandler.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.chenjiahao.typehandler.dao.StudentMapper;
import pers.chenjiahao.typehandler.entity.Student;
import pers.chenjiahao.typehandler.service.StudentService;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 19:41
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
