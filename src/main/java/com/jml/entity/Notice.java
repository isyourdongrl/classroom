package com.jml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 公告实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice {

    /**
     * id
     */
    private Integer id;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 公告内容
     */
    private String Content;

    /**
     * 公告创建时间
     */
    private Date createTime;

    /**
     * 公告更新时间
     */
    private Date updateTime;

    /**
     * 创建者
     */
    private String creator;
}
