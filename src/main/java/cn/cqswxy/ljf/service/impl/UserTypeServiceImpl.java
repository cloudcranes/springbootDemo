package cn.cqswxy.ljf.service.impl;

import cn.cqswxy.ljf.entity.UserType;
import cn.cqswxy.ljf.mapper.UserTypeMapper;
import cn.cqswxy.ljf.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户类型服务层接口
 */

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeMapper userTypeMapper;

    @Override
    public int delByPrimaryKey(Integer userTypeId) {
        return userTypeMapper.deleteByPrimaryKey(userTypeId);
    }

    @Override
    public int add(UserType record) {
        return userTypeMapper.insert(record);
    }

    @Override
    public int addSelective(UserType record) {
        return userTypeMapper.insertSelective(record);
    }

    @Override
    public UserType getByPrimaryKey(Integer userTypeId) {
        return userTypeMapper.selectByPrimaryKey(userTypeId);
    }

    @Override
    public int modByPrimaryKeySelective(UserType record) {
        return userTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int modByPrimaryKey(UserType record) {
        return userTypeMapper.updateByPrimaryKey(record);
    }
}
