package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Checkbox;
import ohos.agp.components.Text;
import ohos.app.Context;

/**
 * 复选框
 * @author yangkaile
 * 2021-06-07 13:57:59
 */
public class CheckboxFactory {

    public static Checkbox getCheckbox(Context context,String text){
        Checkbox checkbox = init(context);
        checkbox.setText(text);
        return checkbox;
    }

    /**
     * TODO 初始化基本样式
     * @param context
     * @return
     */
    private static Checkbox init(Context context){
        Checkbox checkbox = new Checkbox(context);
        checkbox.setTextSize(KellerConfig.COMMON_TEXT_SIZE, Text.TextSizeType.FP);

        return checkbox;
    }
}
