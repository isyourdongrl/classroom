package com.jml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 留言板
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageBoard {

    /**
     * id
     */
    private Integer id;

    /**
     * 留言的用户id
     */
    private Integer userId;

    /**
     * 留言内容
     */
    private String content;

    /**
     * 回复的管理员id
     */
    private Integer replayAdminId;

    /**
     * 回复内容
     */
    private String replayContent;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
