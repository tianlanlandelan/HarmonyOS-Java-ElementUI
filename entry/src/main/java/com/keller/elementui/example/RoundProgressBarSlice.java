package com.keller.elementui.example;

import com.keller.elementui.component.ProgressBarFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.RoundProgressBar;

public class RoundProgressBarSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        RoundProgressBar roundProgressBar =
                ProgressBarFactory.getRoundProgressBar(getContext(),40,200);
        layout.addComponent(roundProgressBar);
    }
}
