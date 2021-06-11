package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Switch;
import ohos.app.Context;

/**
 * 开关
 * @author yangkaile 2021-06-07 14:00:30
 */
public class SwitchFactory {

    public static Switch getSwitch(Context context){
        Switch btnSwitch = new Switch(context);
        btnSwitch.setWidth(KellerConfig.MATCH_CONTENT);
        btnSwitch.setHeight(KellerConfig.MATCH_CONTENT);

        btnSwitch.setCheckedStateChangedListener((button,isChecked) ->{
            System.out.println(isChecked);
        });

        return btnSwitch;
    }
}
