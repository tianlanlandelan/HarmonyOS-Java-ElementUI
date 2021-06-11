package com.keller.elementui.example;

import com.keller.elementui.component.TextFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.Text;

/**
 * @author yangkaile 2021-06-02 10:33:05
 * 文本框组件
 */
public class TextSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        Text text = TextFactory.getText(getContext(),"HelloWorld");
        layout.addComponent(text);
    }
}
