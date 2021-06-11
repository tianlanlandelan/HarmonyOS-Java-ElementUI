package com.keller.elementui.example;

import com.keller.elementui.component.ButtonFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.Button;

public class ButtonSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        //        按钮
        Button button = ButtonFactory.getButton(getContext(),"Button");
        layout.addComponent(button);
        //        圆角按钮
        Button roundButton = ButtonFactory.getRoundButton(getContext(),"RoundButton");
        roundButton.setId(102);
        layout.addComponent(roundButton);
    }
}
