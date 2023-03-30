package com.hhd.work_order.controller;

import com.hhd.work_order.entity.WorkOrder;
import com.hhd.work_order.entity.WorkOrderStatus;
import com.hhd.work_order.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author -无心
 * @date 2023/3/30 13:26:13
 */
@RestController
@RequestMapping("/workorders")
public class WorkOrderController {
    @Autowired
    private WorkOrderService workOrderService;

    @PostMapping
    public WorkOrder createWorkOrder(@RequestBody WorkOrder workOrder) {
        return workOrderService.createWorkOrder(workOrder);
    }

    @GetMapping("/customer")
    public List<WorkOrder> getWorkOrdersForCustomer(@RequestParam String customer) {
        return workOrderService.getWorkOrdersForCustomer(customer);
    }

    @GetMapping("/status")
    public List<WorkOrder> getWorkOrdersByStatus(@RequestParam WorkOrderStatus status) {
        return workOrderService.getWorkOrdersByStatus(status);
    }

    @GetMapping("/maintainer")
    public List<WorkOrder> getWorkOrdersForMaintainer(@RequestParam String maintainer) {
        return workOrderService.getWorkOrdersForMaintainer(maintainer);
    }

    @PutMapping("/{id}")
    public WorkOrder updateWorkOrder(@PathVariable Long id, @RequestBody WorkOrder workOrder) {
        return workOrderService.updateWorkOrder(id, workOrder);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkOrder(@PathVariable Long id) {
        workOrderService.deleteWorkOrder(id);
    }
}
