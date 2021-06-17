package com.keller.elementui.example;

import com.keller.elementui.component.ButtonFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.Button;
import ohos.agp.components.ComponentContainer;
import ohos.agp.utils.LayoutAlignment;


/**
 * @author yangkaile 2021-06-12 13:46:01
 * 用于展示 Button 组件的 AbilitySlice
 * 展示封装好的各种 Button 组件的使用方法
 */
public class ButtonAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        //标准按钮
        Button button = ButtonFactory.getButton(getContext(),"标准按钮");
        layout.addComponent(button);

        //圆角按钮
        Button roundButton = ButtonFactory.getRoundButton(getContext(),"圆角按钮");
        layout.addComponent(roundButton);

        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
