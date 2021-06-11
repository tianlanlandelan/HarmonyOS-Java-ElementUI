package com.keller.elementui.slice;

import com.keller.elementui.color.ColorEnums;
import com.keller.elementui.component.ScrollViewFactory;
import com.keller.elementui.component.ShapeFactory;
import com.keller.elementui.component.TableListFactory;
import com.keller.elementui.layout.DirectionalLayoutFactory;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.*;
import ohos.agp.window.service.Display;
import ohos.agp.window.service.DisplayManager;
import ohos.app.Context;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);

        DirectionalLayout layout = DirectionalLayoutFactory.getVerticalLayout(getContext());


//        页签
        TabList tabList = TableListFactory.getTabList(getContext());
        tabList.setId(4100);
        layout.addComponent(tabList);

        layout.setBackground(ShapeFactory.getRectangleElement(ColorEnums.Info.value, 0));


//        滚动视图
        ScrollView scrollView = ScrollViewFactory.getScrollView(getContext(),layout);

//      ===================================================================

        super.setUIContent(scrollView);

    }

    /**
     * 获取界面宽度
     * @param context
     * @return px 值
     */
    private static int getDisplayWith(Context context){
        Display display = DisplayManager.getInstance().getDefaultDisplay(context).get();
        return display.getAttributes().width;
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
