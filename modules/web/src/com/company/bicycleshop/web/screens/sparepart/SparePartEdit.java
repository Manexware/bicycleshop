package com.company.bicycleshop.web.screens.sparepart;

import com.haulmont.cuba.gui.screen.*;
import com.company.bicycleshop.entity.SparePart;

@UiController("bicycleshop_SparePart.edit")
@UiDescriptor("spare-part-edit.xml")
@EditedEntityContainer("sparePartDc")
@LoadDataBeforeShow
public class SparePartEdit extends StandardEditor<SparePart> {
}