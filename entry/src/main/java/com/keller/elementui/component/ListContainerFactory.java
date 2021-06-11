package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Component;
import ohos.agp.components.ListContainer;
import ohos.app.Context;

public class ListContainerFactory {

    public static ListContainer getListContainer(Context context){
        ListContainer listContainer = init(context);

        return listContainer;
    }

    private static ListContainer init(Context context){
        ListContainer listContainer = new ListContainer(context);
        listContainer.setPadding(10,10,0,0);
        listContainer.setWidth(KellerConfig.MATCH_PARENT);
        listContainer.setHeight(KellerConfig.MATCH_PARENT);
        listContainer.setOrientation(Component.VERTICAL);

        return listContainer;
    }
}
