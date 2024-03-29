package cool.yunlong.shop.service.impl;

import bean.User;
import cool.yunlong.shop.mapper.UserMapper;
import cool.yunlong.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现类
 *
 * @author yunlong
 * @since 2022/4/22 10:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long userId) {
        return userMapper.selectById(userId);
    }
}
