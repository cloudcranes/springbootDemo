package cn.cqswxy.ljf.mapper;

import cn.cqswxy.ljf.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户操作层
 */
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}