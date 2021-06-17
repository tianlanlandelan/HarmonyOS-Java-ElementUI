package com.keller.elementui.example;


import com.keller.elementui.component.TimePickerFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.TimePicker;
import ohos.agp.utils.LayoutAlignment;

public class ToastDialogAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        TimePicker timePicker = TimePickerFactory.getTimePicker(getContext());
        layout.addComponent(timePicker);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
