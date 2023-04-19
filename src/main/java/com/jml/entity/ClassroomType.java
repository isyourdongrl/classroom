package com.jml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 教室类型实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomType {

    /**
     * id
     */
    private Integer id;

    /**
     * 教室类型名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建者
     */
    private String creator;


}
