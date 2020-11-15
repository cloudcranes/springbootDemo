package cn.cqswxy.ljf.service;

import cn.cqswxy.ljf.entity.User;

/**
 * 用户服务层
 */
public interface UserService {

    int delByPrimaryKey(Integer userId);

    int add(User record);

    int addSelective(User record);

    User getByPrimaryKey(Integer userId);

    int modByPrimaryKeySelective(User record);

    int modByPrimaryKey(User record);

}
