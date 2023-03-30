package com.hhd.work_order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author -无心
 * @date 2023/3/30 13:17:11
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class WorkOrder {
    /**
     * 工单id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 客户
     */
    @Column(nullable = false)
    private String customer;
    /**
     * 标题
     */
    @Column(nullable = false)
    private String title;
    /**
     * 工单内容
     */
    @Column(nullable = false)
    private String description;
    /**
     * 状态
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private WorkOrderStatus status;
    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createDate;
    /**
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date updateDate;
    /**
     * 工单接收人员
     */
    @Column(nullable = false)
    private String maintainer;

}
