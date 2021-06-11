package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.DatePicker;
import ohos.agp.components.TimePicker;
import ohos.app.Context;

/**
 * 时间选择器
 * @author yangkaile 2021-06-07 14:01:39
 */
public class TimePickerFactory {

    public static TimePicker getTimePicker(Context context){
        TimePicker timePicker = new TimePicker(context);
        timePicker.set24Hour(true);
        timePicker.setHeight(KellerConfig.MATCH_CONTENT);
        timePicker.setWidth(KellerConfig.MATCH_PARENT);
        timePicker.setNormalTextSize(40);
        timePicker.setSelectedTextSize(80);
        timePicker.setWheelModeEnabled(true);

        timePicker.setTimeChangedListener((timePicker1,hour,minute,second) ->{
            System.out.println(hour + ":" + minute + ":" + second);
        });

        return timePicker;
    }
}
