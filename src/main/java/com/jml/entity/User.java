package com.jml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * id
     */
    private Integer id;

    /**
     * 用户名/账号
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 学院名
     */
    private String collectName;

    /**
     * 专业班级
     */
    private String className;

    /**
     * 学号
     */
    private String studentId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
