package com.company.bicycleshop.web.screens.mechanic;

import com.haulmont.cuba.gui.screen.*;
import com.company.bicycleshop.entity.Mechanic;

@UiController("bicycleshop_Mechanic.browse")
@UiDescriptor("mechanic-browse.xml")
@LookupComponent("mechanicsTable")
@LoadDataBeforeShow
public class MechanicBrowse extends StandardLookup<Mechanic> {
}