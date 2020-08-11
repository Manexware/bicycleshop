package com.company.bicycleshop.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.bicycleshop.entity.Client;

@UiController("bicycleshop_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}