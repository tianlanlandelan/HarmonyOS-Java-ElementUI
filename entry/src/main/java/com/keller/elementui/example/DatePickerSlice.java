package com.keller.elementui.example;

import com.keller.elementui.component.DatePickerFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.DatePicker;

public class DatePickerSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        String minDate = "2021-01-01";
        String maxDate = "2021-12-31";
        DatePicker datePicker = DatePickerFactory.getDatePicker(getContext(),minDate,maxDate);
        layout.addComponent(datePicker);
    }

}
