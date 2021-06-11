package com.keller.elementui.example;

import com.keller.elementui.component.CheckboxFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.Checkbox;

public class CheckboxSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        Checkbox checkbox = CheckboxFactory
                .getCheckbox(getContext(),"这是一个Checkbox");

        layout.addComponent(checkbox);
    }
}
