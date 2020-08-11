package com.company.bicycleshop.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.bicycleshop.entity.Client;

@UiController("bicycleshop_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {

}