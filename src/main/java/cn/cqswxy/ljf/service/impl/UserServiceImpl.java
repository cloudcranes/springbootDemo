package cn.cqswxy.ljf.service.impl;

import cn.cqswxy.ljf.entity.User;
import cn.cqswxy.ljf.mapper.UserMapper;
import cn.cqswxy.ljf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务层接口
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int delByPrimaryKey(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int add(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int addSelective(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User getByPrimaryKey(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int modByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int modByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
