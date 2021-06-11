package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import com.keller.elementui.util.DateUtil;
import ohos.agp.components.DatePicker;
import ohos.app.Context;

/**
 * 日期选择器
 * @author yangkaile 2021-06-07 13:58:19
 */
public class DatePickerFactory {


    public static DatePicker getDatePicker(Context context,String minDateStr,String maxDateStr){
        Long minDate = DateUtil.getDate(minDateStr).getTime() / 1000;
        Long maxDate = DateUtil.getDate(maxDateStr).getTime() / 1000;

        return getDatePicker(context,minDate,maxDate);
    }

    public static DatePicker getDatePicker(Context context,Long minDate,Long maxDate){
        DatePicker datePicker = getDatePicker(context);
        datePicker.setMinDate(minDate);
        datePicker.setMaxDate(maxDate);
        return datePicker;
    }

    public static DatePicker getDatePicker(Context context){
        DatePicker datePicker = new DatePicker(context);
        datePicker.setDateOrder(DatePicker.DateOrder.YMD);
        datePicker.setHeight(KellerConfig.MATCH_CONTENT);
        datePicker.setWidth(KellerConfig.MATCH_PARENT);
        datePicker.setNormalTextSize(40);
        datePicker.setSelectedTextSize(80);
        datePicker.setWheelModeEnabled(true);

        datePicker.setValueChangedListener((datePicker1,year,month,day)->{
            System.out.println(year + "-" + month + "-" + day);
        });

        return datePicker;
    }
}
