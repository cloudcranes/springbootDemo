package cn.cqswxy.ljf.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * t_user
 * 用户表
 *
 * @author
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer userId;
    private String userAccess;
    private String userPassword;
    private String userName;
    private Integer userType;
    private Date userLastTime;
}