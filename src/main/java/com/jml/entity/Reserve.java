package com.jml.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 预约实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserve {

    /**
     * id
     */
    private Integer id;

    /**
     * 预约的用户id
     */
    private Integer userId;

    /**
     * 教室id
     */
    private Integer classroomId;

    /**
     * 预约的开始时间
     */
    private Date reserveTimeStart;

    /**
     * 预约的结束时间
     */
    private Date reserveTimeEnd;

    /**
     * 预约是否通过审批
     */
    private Boolean isApprove;

    /**
     * 审批人
     */
    private String approver;

    /**
     * 审批时间
     */
    private Date approveTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
