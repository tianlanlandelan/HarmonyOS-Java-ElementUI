package com.keller.elementui.component;

import com.keller.elementui.color.ColorEnums;
import com.keller.elementui.color.ColorFactory;
import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;
import ohos.app.Context;

/**
 * 文本
 * @author yangkaile
 * 2021-06-02 13:54:59
 * Text 工具，构建出各种 Text 组件
 */
public class TextFactory {

    public static Text getText(Context context,String str){
        Text text = getText(context);
        text.setText(str);

        return text;
    }

    /**
     * 构建一个标准的 Text
     * @param context
     * @return
     */
    public static Text getText(Context context){
        Text text = new Text(context);
        text.setWidth(KellerConfig.MATCH_CONTENT);
        text.setHeight(KellerConfig.MATCH_CONTENT);
        text.setTextSize(KellerConfig.COMMON_TEXT_SIZE, Text.TextSizeType.FP);
        text.setTextColor(new Color(Color.getIntColor(ColorEnums.MainText.value)));
        text.setPadding(10,5,10,5);

        return text;
    }
}
