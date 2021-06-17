package com.keller.elementui.template;

import com.keller.elementui.component.ScrollViewFactory;
import com.keller.elementui.layout.DirectionalLayoutFactory;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.ScrollView;

/**
 * 一个 AbilitySlice 的模板，使用 垂直排列的布局方式，支持滚动
 * 可以在此基础上定义各种模板页面，使得新建 AbilitySlice 只需要关注实际展现的组件
 * @author yangkaile 2021-06-12 13:39:39
 */
public abstract class TemplateAbilitySlice extends AbilitySlice {

    public DirectionalLayout layout;

    public abstract void initTemplate();

    /**
     * 使用 垂直排列的布局方式，支持滚动
     * @param intent
     */
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        layout = DirectionalLayoutFactory.getVerticalLayout(getContext());

        //TODO 为了展示效果，暂时用 PaddingTop
        layout.setPaddingTop(100);

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
