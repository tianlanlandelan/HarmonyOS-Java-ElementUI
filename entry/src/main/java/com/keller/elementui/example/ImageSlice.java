package com.keller.elementui.example;

import com.keller.elementui.ResourceTable;
import com.keller.elementui.color.ColorEnums;
import com.keller.elementui.component.ImageFactory;
import com.keller.elementui.component.ShapeFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.Image;


/**
 * @author yangkaile 2021-06-02 10:33:05
 * 文本框组件
 */
public class ImageSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        Image image = ImageFactory.getImageByResourceId(getContext(), ResourceTable.Media_java);

        layout.addComponent(image);

        layout.setBackground(ShapeFactory.getRectangleElement(ColorEnums.PlaceHolderText.value, 0));

    }
}
