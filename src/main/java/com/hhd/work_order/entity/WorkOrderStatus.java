package com.hhd.work_order.entity;

import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * @author -无心
 * @date 2023/3/30 13:18:07
 */

public enum WorkOrderStatus {
    /**
     * 新的工单
     */
    NEW,
    /**
     * 正在进行的工单
     */
    IN_PROGRESS,
    /**
     * 已解决的工单
     */
    RESOLVED,
    /**
     * 关闭的工单
     */
    CLOSED
}
