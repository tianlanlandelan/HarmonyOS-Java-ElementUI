package com.keller.elementui.provider;

import com.keller.elementui.color.ColorEnums;
import com.keller.elementui.component.ShapeFactory;
import com.keller.elementui.component.TextFactory;
import com.keller.elementui.config.KellerConfig;
import com.keller.elementui.entry.SampleItem;
import com.keller.elementui.layout.DirectionalLayoutFactory;
import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.*;
import ohos.multimodalinput.event.TouchEvent;

import java.util.List;

public class TestProvider extends BaseItemProvider {

    private List<SampleItem> list;

    private AbilitySlice slice;

    public TestProvider(List<SampleItem> list, AbilitySlice slice) {
        this.list = list;
        this.slice = slice;
    }

    @Override
    public int getCount() {
        return list == null ? 0 :list.size();
    }

    @Override
    public Object getItem(int position) {
        if (list != null && position >= 0 && position < list.size()){
            return list.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Component getComponent(int position, Component convertComponent, ComponentContainer componentContainer) {
        final DirectionalLayout component;
        component = DirectionalLayoutFactory.getVerticalLayout(slice.getContext());
        component.setHeight(KellerConfig.MATCH_CONTENT);
        component.setWidth(KellerConfig.MATCH_PARENT);
        component.setPadding(20,10,20,10);
        component.setMarginsTopAndBottom(5,5);


        SampleItem sampleItem = list.get(position);
        Text name = TextFactory.getText(component.getContext(),sampleItem.getName());
        name.setTextSize(20, Text.TextSizeType.FP);

        component.addComponent(name);

        Text description = TextFactory.getText(component.getContext(),sampleItem.getDescription());
        description.setMaxTextWidth(1000);
        description.setTruncationMode(Text.TruncationMode.ELLIPSIS_AT_END);
        component.addComponent(description);

        // 每个元素用横线分隔
        if(position < list.size() - 1){
            DirectionalLayout line = ShapeFactory.getLine(slice.getContext(), ColorEnums.Info.value, 2);

            component.addComponent(line);
        }

        // 触摸变化
        component.setTouchEventListener((component1,event) ->{
            // event.getAction() 方法不能调用多次，否则会闪退 我也不知道这是什么奇怪的问题
            int action = event.getAction();
            System.out.println("===================" + action);
            if(action == TouchEvent.PRIMARY_POINT_DOWN || action == TouchEvent.POINT_MOVE){
                component1.setBackground(ShapeFactory.getRectangleElement(ColorEnums.Success.value, 10));
                return true;
            }
            component1.setBackground(ShapeFactory.getRectangleElement(ColorEnums.White.value, 10));
            return true;
        });


        return component;
    }
}
