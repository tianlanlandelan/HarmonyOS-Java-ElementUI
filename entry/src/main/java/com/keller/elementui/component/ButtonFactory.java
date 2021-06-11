package com.keller.elementui.component;

import com.keller.elementui.color.ColorEnums;
import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Button;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;
import ohos.app.Context;

/**
 * 按钮
 * @author yangkaile
 * 2021-06-02 14:35:36
 * Button 工具，构建各种样式的 Button
 */
public class ButtonFactory {

    /**
     * 构建一个标准的 Button
     * 样式参照 ElementUI 的 主要按钮
     * https://element.eleme.cn/#/zh-CN/component/button
     * @param context
     * @return
     */
    public static Button getButton(Context context,String name){
        Button button = initButton(context, KellerConfig.COMMON_RADIUS);
        button.setText(name);

        return button;
    }

    public static Button getRoundButton(Context context,String name){
        Button button = initButton(context,KellerConfig.ROUND_RADIUS);
        button.setText(name);
        return button;
    }

    private static Button initButton(Context context,Integer radius){
        Button button = new Button(context);
        button.setWidth(KellerConfig.MATCH_CONTENT);
        button.setHeight(KellerConfig.MATCH_CONTENT);
        button.setTextSize(KellerConfig.COMMON_TEXT_SIZE, Text.TextSizeType.FP);
        button.setTextColor(Color.WHITE);
        button.setBackground(ShapeFactory.getRectangleElement(ColorEnums.Main.value,radius));
        button.setPadding(24,12,24,12);
        button.setMarginsLeftAndRight(10,10);
        button.setMarginsTopAndBottom(10,10);

        return button;
    }
}
