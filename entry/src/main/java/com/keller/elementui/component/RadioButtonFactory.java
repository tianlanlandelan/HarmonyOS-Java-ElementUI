package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.RadioButton;
import ohos.agp.components.RadioContainer;
import ohos.agp.components.Text;
import ohos.app.Context;

/**
 * 单选按钮
 * @author yangkaile 2021-06-07 14:00:17
 */
public class RadioButtonFactory {

    public static RadioContainer getRadioContainer(Context context,String[] items){
        RadioContainer container = initRadioContainer(context);

        for (String item : items) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(item);
            radioButton.setTextSize(KellerConfig.COMMON_TEXT_SIZE, Text.TextSizeType.FP);

            container.addComponent(radioButton);
        }
        return container;
    }



    private static RadioContainer initRadioContainer(Context context){
        RadioContainer container = new RadioContainer(context);

        container.setMarkChangedListener((container1,index) ->{
            System.out.println(index);
        });

        return container;
    }
}
