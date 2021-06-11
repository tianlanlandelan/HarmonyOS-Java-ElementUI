package com.keller.elementui.layout;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.DirectionalLayout;
import ohos.app.Context;

/**
 * @author yangkaile
 * 2021-06-02 10:59:18
 * DirectionalLayout 工具类
 *
 * DirectionalLayout 是Java UI中的一种重要组件布局，
 * 用于将一组组件(Component)按照水平或者垂直方向排布，能够方便地对齐布局内的组件。
 * 该布局和其他布局的组合，可以实现更加丰富的布局方式。
 */
public class DirectionalLayoutFactory {

    /**
     * 构建一个垂直方向的布局
     * @param context
     * @return
     */
    public static DirectionalLayout getVerticalLayout(Context context){
        DirectionalLayout layout = initLayout(context);
        layout.setOrientation(Component.VERTICAL);
        return layout;
    }

    public static DirectionalLayout getVerticalLayout(Context context,Integer padding){
        DirectionalLayout layout = getVerticalLayout(context);
        layout.setPadding(padding,padding,padding,padding);
        return layout;
    }

    /**
     * 构建一个水平方向的布局
     * @param context
     * @return
     */
    public static DirectionalLayout getHorizontalLayout(Context context){
        DirectionalLayout layout = initLayout(context);
        layout.setOrientation(Component.HORIZONTAL);
        return layout;
    }

    /**
     * 构建一个标准的 DirectionalLayout
     * @param context
     * @return
     */
    private static DirectionalLayout initLayout(Context context){
        DirectionalLayout layout = new DirectionalLayout(context);
        layout.setWidth(KellerConfig.MATCH_PARENT);
        layout.setHeight(KellerConfig.MATCH_PARENT);

        return layout;
    }
}
