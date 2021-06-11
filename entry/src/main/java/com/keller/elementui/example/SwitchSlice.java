package com.keller.elementui.example;

import com.keller.elementui.component.SwitchFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.Switch;

public class SwitchSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        Switch btnSwitch = SwitchFactory.getSwitch(getContext());
        layout.addComponent(btnSwitch);
    }
}
