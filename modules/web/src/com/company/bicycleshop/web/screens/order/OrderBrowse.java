package com.company.bicycleshop.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.bicycleshop.entity.Order;

@UiController("bicycleshop_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}