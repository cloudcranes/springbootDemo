package cn.cqswxy.ljf.service;

import cn.cqswxy.ljf.entity.UserType;

/**
 * 用户类型服务层
 */
public interface UserTypeService {

    int delByPrimaryKey(Integer userTypeId);

    int add(UserType record);

    int addSelective(UserType record);

    UserType getByPrimaryKey(Integer userTypeId);

    int modByPrimaryKeySelective(UserType record);

    int modByPrimaryKey(UserType record);

}
