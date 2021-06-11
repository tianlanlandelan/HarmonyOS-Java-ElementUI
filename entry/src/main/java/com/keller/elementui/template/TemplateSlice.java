package com.keller.elementui.template;

import com.keller.elementui.component.ScrollViewFactory;
import com.keller.elementui.layout.DirectionalLayoutFactory;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.ScrollView;

public abstract class TemplateSlice extends AbilitySlice {

    public DirectionalLayout layout;

    public abstract void initTemplate();

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        layout = DirectionalLayoutFactory.getVerticalLayout(getContext());

        ScrollView scrollView = ScrollViewFactory.getScrollView(getContext(),layout);

        super.setUIContent(scrollView);
        initTemplate();
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
