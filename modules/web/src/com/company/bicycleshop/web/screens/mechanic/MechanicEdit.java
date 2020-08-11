package com.company.bicycleshop.web.screens.mechanic;

import com.haulmont.cuba.gui.screen.*;
import com.company.bicycleshop.entity.Mechanic;

@UiController("bicycleshop_Mechanic.edit")
@UiDescriptor("mechanic-edit.xml")
@EditedEntityContainer("mechanicDc")
@LoadDataBeforeShow
public class MechanicEdit extends StandardEditor<Mechanic> {
}