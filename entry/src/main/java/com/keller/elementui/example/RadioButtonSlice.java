package com.keller.elementui.example;

import com.keller.elementui.component.RadioButtonFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.RadioContainer;

public class RadioButtonSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        String[] radioItems = {"A.25%","B.50%","C.75%","D.100%"};
        RadioContainer radioContainer = RadioButtonFactory.getRadioContainer(getContext(),radioItems);
        layout.addComponent(radioContainer);
    }
}
