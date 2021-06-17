package com.keller.elementui.example;

import com.keller.elementui.component.TextFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.Text;
import ohos.agp.utils.LayoutAlignment;

/**
 * @author yangkaile 2021-06-02 10:33:05
 * 文本框组件
 */
public class TextAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        Text text = TextFactory.getText(getContext(),"HelloWorld");
        layout.addComponent(text);

        
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }
}
