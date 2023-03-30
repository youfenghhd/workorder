package com.hhd.work_order.repository;

import com.hhd.work_order.entity.WorkOrder;
import com.hhd.work_order.entity.WorkOrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author -无心
 * @date 2023/3/30 13:21:41
 */
@Repository
public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {
    List<WorkOrder> findByCustomer(String customer);
    List<WorkOrder> findByStatus(WorkOrderStatus status);
    List<WorkOrder> findByMaintainer(String maintainer);
}
