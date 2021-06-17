package com.keller.elementui.example;

import com.keller.elementui.component.ProgressBarFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.RoundProgressBar;
import ohos.agp.utils.LayoutAlignment;

public class RoundProgressBarAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        RoundProgressBar roundProgressBar =
                ProgressBarFactory.getRoundProgressBar(getContext(),40,200);
        layout.addComponent(roundProgressBar);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
