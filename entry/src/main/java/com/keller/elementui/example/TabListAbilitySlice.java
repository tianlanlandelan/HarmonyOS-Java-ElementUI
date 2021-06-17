package com.keller.elementui.example;

import com.keller.elementui.component.TableListFactory;
import com.keller.elementui.template.TemplateAbilitySlice;
import ohos.agp.components.TabList;
import ohos.agp.utils.LayoutAlignment;

//TODO
public class TabListAbilitySlice extends TemplateAbilitySlice {
    @Override
    public void initTemplate() {
        TabList tabList = TableListFactory.getTabList(getContext());
        tabList.setId(4100);
        layout.addComponent(tabList);
        //设置水平居中
        layout.setAlignment(LayoutAlignment.HORIZONTAL_CENTER);
    }

}
