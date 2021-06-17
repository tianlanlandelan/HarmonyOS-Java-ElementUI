package com.keller.elementui.example;

import com.keller.elementui.component.DatePickerFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.DatePicker;
import ohos.agp.utils.LayoutAlignment;

public class DatePickerAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        String minDate = "2020-01-01";
        String maxDate = "2021-12-31";
        DatePicker datePicker = DatePickerFactory.getDatePicker(getContext(),minDate,maxDate);
        layout.addComponent(datePicker);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }

}
