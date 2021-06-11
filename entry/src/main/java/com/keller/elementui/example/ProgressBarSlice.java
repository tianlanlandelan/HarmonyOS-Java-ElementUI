package com.keller.elementui.example;

import com.keller.elementui.component.ProgressBarFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.ProgressBar;

public class ProgressBarSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        ProgressBar progressBar = ProgressBarFactory.getProgressBar(getContext(),40);
        layout.addComponent(progressBar);
    }

}
