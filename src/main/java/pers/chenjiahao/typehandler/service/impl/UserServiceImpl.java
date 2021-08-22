package pers.chenjiahao.typehandler.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.chenjiahao.typehandler.dao.UserMapper;
import pers.chenjiahao.typehandler.entity.User;
import pers.chenjiahao.typehandler.service.UserService;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 19:41
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
