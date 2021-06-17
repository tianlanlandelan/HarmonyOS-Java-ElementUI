package com.keller.elementui.example;

import com.keller.elementui.component.SwitchFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.Switch;
import ohos.agp.utils.LayoutAlignment;

public class SwitchAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        Switch btnSwitch = SwitchFactory.getSwitch(getContext());
        layout.addComponent(btnSwitch);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
