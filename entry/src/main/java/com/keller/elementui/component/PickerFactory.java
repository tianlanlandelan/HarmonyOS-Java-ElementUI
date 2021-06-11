package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Picker;
import ohos.app.Context;

/**
 * 选择器
 * @author yangkaile 2021-06-07 13:58:48
 */
public class PickerFactory {



    public static Picker getPicker(Context context,String[] dataArray){
        Picker picker = getPicker(context);
        picker.setMinValue(0);
        picker.setMaxValue(dataArray.length - 1);
        picker.setDisplayedData(dataArray);

        return picker;
    }


    public static Picker getPicker(Context context){
        Picker picker = new Picker(context);
        picker.setWidth(300);
        picker.setHeight(200);

        picker.setNormalTextSize(40);
        picker.setSelectedTextSize(60);

        picker.setValueChangedListener((picker1, oldVal, newVal) -> {
            // oldVal:上一次选择的值； newVal：最新选择的值
            System.out.println(oldVal + "->" + newVal);
        });

        return picker;
    }
}
