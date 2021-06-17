package com.keller.elementui.example;

import com.keller.elementui.component.ProgressBarFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.ProgressBar;
import ohos.agp.utils.LayoutAlignment;

public class ProgressBarAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        ProgressBar progressBar = ProgressBarFactory.getProgressBar(getContext(),40);
        layout.addComponent(progressBar);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }

}
