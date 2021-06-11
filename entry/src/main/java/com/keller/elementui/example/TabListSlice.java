package com.keller.elementui.example;

import com.keller.elementui.component.TableListFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.TabList;

//TODO
public class TabListSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        TabList tabList = TableListFactory.getTabList(getContext());
        tabList.setId(4100);
        layout.addComponent(tabList);
    }

}
