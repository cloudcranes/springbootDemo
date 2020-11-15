package cn.cqswxy.ljf.mapper;

import cn.cqswxy.ljf.entity.UserType;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户类型操作层
 */
@Mapper
public interface UserTypeMapper {

    int deleteByPrimaryKey(Integer userTypeId);

    int insert(UserType record);

    int insertSelective(UserType record);

    UserType selectByPrimaryKey(Integer userTypeId);

    int updateByPrimaryKeySelective(UserType record);

    int updateByPrimaryKey(UserType record);

}