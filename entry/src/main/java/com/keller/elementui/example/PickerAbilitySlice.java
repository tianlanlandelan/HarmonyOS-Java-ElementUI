package com.keller.elementui.example;

import com.keller.elementui.component.PickerFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.Picker;
import ohos.agp.utils.LayoutAlignment;

public class PickerAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        String[] pickerData= {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Picker picker = PickerFactory.getPicker(getContext(),pickerData);
        layout.addComponent(picker);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
