package com.keller.elementui.example;

import com.keller.elementui.component.TextFieldFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.TextField;
import ohos.agp.utils.LayoutAlignment;

public class TextFieldAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        TextField textField = TextFieldFactory.getTextField(getContext(),"Hello World");
        layout.addComponent(textField);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
