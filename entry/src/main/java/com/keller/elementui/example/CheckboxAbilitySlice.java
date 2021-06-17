package com.keller.elementui.example;

import com.keller.elementui.component.CheckboxFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.Checkbox;
import ohos.agp.utils.LayoutAlignment;

public class CheckboxAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        Checkbox checkbox = CheckboxFactory
                .getCheckbox(getContext(),"这是一个Checkbox");

        checkbox.setCheckedStateChangedListener((checkbox1,checked)->{
            System.out.println("================");
            System.out.println(checked);
        });
        layout.addComponent(checkbox);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
