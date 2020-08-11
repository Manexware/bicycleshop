package com.company.bicycleshop.web.screens.sparepart;

import com.haulmont.cuba.gui.screen.*;
import com.company.bicycleshop.entity.SparePart;

@UiController("bicycleshop_SparePart.browse")
@UiDescriptor("spare-part-browse.xml")
@LookupComponent("sparePartsTable")
@LoadDataBeforeShow
public class SparePartBrowse extends StandardLookup<SparePart> {
}