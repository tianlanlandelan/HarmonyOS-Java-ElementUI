package com.keller.elementui.example;

import com.keller.elementui.component.TextFieldFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.TextField;

public class TextFieldSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        TextField textField = TextFieldFactory.getTextField(getContext(),"Hello World");
        layout.addComponent(textField);
    }
}
