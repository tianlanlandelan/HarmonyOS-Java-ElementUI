package com.keller.elementui.example;

import com.keller.elementui.component.TimePickerFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.TimePicker;

public class TimePickerSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        TimePicker timePicker = TimePickerFactory.getTimePicker(getContext());
        layout.addComponent(timePicker);
    }
}
