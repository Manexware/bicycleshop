package com.company.bicycleshop.web.screens.order;

import com.company.bicycleshop.entity.OrderStatus;
import com.company.bicycleshop.service.OrderService;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.bicycleshop.entity.Order;

import javax.inject.Inject;

@UiController("bicycleshop_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
    @Inject
    private OrderService orderService;

    @Subscribe
    protected void initNewItem(InitEntityEvent<Order> event){
        Order order = event.getEntity();
        order.setStatus(OrderStatus.NEW);
    }

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPreCommit(DataContext.PreCommitEvent event) {
        Order order = getEditedEntity();
        order.setAmount(orderService.calculateAmount(order));
    }
}