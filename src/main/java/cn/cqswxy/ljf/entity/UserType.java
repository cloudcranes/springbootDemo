package cn.cqswxy.ljf.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * t_user_type
 * 用户类型表
 *
 * @author
 */
@Data
public class UserType implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer userTypeId;
    /**
     * 员工的级别
     */
    private String userTypeName;
}