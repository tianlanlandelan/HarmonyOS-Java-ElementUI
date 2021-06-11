package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Component;
import ohos.agp.components.TabList;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;
import ohos.app.Context;


/**
 * 页签
 * @author yangkaile 2021-06-07 14:00:59
 */
public class TableListFactory {

    /**
     * TODO TabList 未显示
     * @param context
     * @return
     */
    public static TabList getTabList(Context context){
        TabList tabList = new TabList(context);
        tabList.setWidth(800);
        tabList.setHeight(40);
//        tabList.setTabTextColors(1,1);
//        tabList.setOrientation(Component.HORIZONTAL);
//        tabList.setFixedMode(true);
//        tabList.setTabTextSize(KellerConfig.COMMON_TEXT_SIZE);

        String[] tabTitles = {"Image","Video","Audio","Text"};
        for (String title : tabTitles) {
            TabList.Tab tab = tabList.new Tab(context);
            tab.setText(title);
            tab.setTextColor(Color.BLACK);
            tab.setTextSize(KellerConfig.COMMON_TEXT_SIZE, Text.TextSizeType.FP);
            tabList.addTab(tab);
        }


        return tabList;
    }
}
