package com.jml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 教室实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classroom {

    /**
     * id
     */
    private Integer id;

    /**
     * 教室类型id
     */
    private Integer classroomTypeId;

    /**
     * 教室名称
     */
    private String classroomName;

    /**
     * 教学楼号
     */
    private Integer buildNum;

    /**
     * 楼层号
     */
    private Integer floorNum;

    /**
     * 教室号
     */
    private Integer classroomNum;

    /**
     * 预约开始时间
     */
    private Date reserveTimeStart;

    /**
     * 预约结束时间
     */
    private Date reserveTimeEnd;

    /**
     * 是否被预约/占用
     */
    private Boolean isReserve;

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
