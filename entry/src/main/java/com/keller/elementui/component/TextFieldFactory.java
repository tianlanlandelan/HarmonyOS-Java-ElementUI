package com.keller.elementui.component;

import com.keller.elementui.color.ColorEnums;
import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;
import ohos.app.Context;

/**
 * 文本框
 */
public class TextFieldFactory {

    public static TextField getTextField(Context context,String str){
        TextField textField = new TextField(context);
        textField.setWidth(KellerConfig.MATCH_PARENT);
        textField.setHeight(KellerConfig.MATCH_PARENT);
        textField.setTextSize(KellerConfig.COMMON_TEXT_SIZE, Text.TextSizeType.FP);
        textField.setTextColor(new Color(Color.getIntColor(ColorEnums.MainText.value)));
        textField.setPadding(10,10,10,10);
        ShapeElement shape = ShapeFactory.getRectangleElement(ColorEnums.White.value, KellerConfig.COMMON_RADIUS);
        textField.setBackground(shape);
        textField.setText(str);
        return textField;
    }
}
