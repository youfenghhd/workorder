package com.hhd.work_order.service;

import com.hhd.work_order.entity.WorkOrder;
import com.hhd.work_order.entity.WorkOrderStatus;
import com.hhd.work_order.repository.WorkOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author -无心
 * @date 2023/3/30 13:25:14
 */
@Service
public class WorkOrderService {
    @Autowired
    private WorkOrderRepository workOrderRepository;

    public WorkOrder createWorkOrder(WorkOrder workOrder) {
        workOrder.setStatus(WorkOrderStatus.NEW);
        workOrder.setCreateDate(new Date());
        workOrder.setUpdateDate(new Date());
        return workOrderRepository.save(workOrder);
    }

    public List<WorkOrder> getWorkOrdersForCustomer(String customer) {
        return workOrderRepository.findByCustomer(customer);
    }

    public List<WorkOrder> getWorkOrdersByStatus(WorkOrderStatus status) {
        return workOrderRepository.findByStatus(status);
    }

    public List<WorkOrder> getWorkOrdersForMaintainer(String maintainer) {
        return workOrderRepository.findByMaintainer(maintainer);
    }
    public WorkOrder updateWorkOrder(Long id, WorkOrder updatedWorkOrder) {
        WorkOrder existingWorkOrder = workOrderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Work order not found"));

        existingWorkOrder.setCustomer(updatedWorkOrder.getCustomer());
        existingWorkOrder.setTitle(updatedWorkOrder.getTitle());
        existingWorkOrder.setDescription(updatedWorkOrder.getDescription());
        existingWorkOrder.setStatus(updatedWorkOrder.getStatus());
        existingWorkOrder.setUpdateDate(new Date());
        existingWorkOrder.setMaintainer(updatedWorkOrder.getMaintainer());

        return workOrderRepository.save(existingWorkOrder);
    }

    public void deleteWorkOrder(Long id) {
        workOrderRepository.deleteById(id);
    }
}
