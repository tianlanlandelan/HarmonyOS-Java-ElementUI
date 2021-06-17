package com.keller.elementui.example;

import com.keller.elementui.component.RadioButtonFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.RadioContainer;
import ohos.agp.utils.LayoutAlignment;

public class RadioButtonAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        String[] radioItems = {"A.25%","B.50%","C.75%","D.100%"};
        RadioContainer radioContainer = RadioButtonFactory.getRadioContainer(getContext(),radioItems);
        layout.addComponent(radioContainer);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
