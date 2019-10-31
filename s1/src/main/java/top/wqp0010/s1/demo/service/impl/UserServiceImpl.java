package top.wqp0010.s1.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.wqp0010.s1.demo.entity.UserEntity;
import top.wqp0010.s1.demo.mapper.UserMapper;
import top.wqp0010.s1.demo.service.IUserService;

/**
 * @author: cook
 * @date: 2019年10月31日23:22:44
 * @description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

}
