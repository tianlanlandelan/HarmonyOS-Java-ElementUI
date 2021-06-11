package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.ScrollView;
import ohos.app.Context;

public class ScrollViewFactory {
    public static ScrollView getScrollView(Context context, DirectionalLayout layout){
        ScrollView scrollView = new ScrollView(context);

        scrollView.addComponent(layout);
        scrollView.setReboundEffect(true);

        scrollView.setWidth(KellerConfig.MATCH_PARENT);
        scrollView.setHeight(KellerConfig.MATCH_PARENT);

        return scrollView;
    }
}
