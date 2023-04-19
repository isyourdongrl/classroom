package com.jml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 管理员实体类
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Admin {

    /**
     * id
     */
    private Integer id;

    /**
     * 管理员名/账号
     */
    private String username;

    /**
     * 管理员密码
     */
    private String password;

    /**
     * 真实项目
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String creator;
}
