package com.keller.elementui.example;

import com.keller.elementui.component.PickerFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.Picker;

public class PickerSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        String[] pickerData= {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Picker picker = PickerFactory.getPicker(getContext(),pickerData);
        layout.addComponent(picker);
    }
}
