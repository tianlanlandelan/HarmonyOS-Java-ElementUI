package com.keller.elementui.component;

import com.keller.elementui.color.ColorFactory;
import com.keller.elementui.layout.DirectionalLayoutFactory;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.element.ShapeElement;
import ohos.app.Context;

/**
 * 形状工厂，构建不同的形状元素与形状组件
 *
 * @author yangkaile 2021-06-11 00:14:39
 */
public class ShapeFactory {
    /**
     * 获取一个 Line (直线) 组件，可在界面上直接显示
     * @param context
     * @param hexColor  颜色值 #FFFFFF
     * @param width 直线宽度
     * @return
     */
    public static DirectionalLayout getLine(Context context, String hexColor, Integer width){
        DirectionalLayout layout = DirectionalLayoutFactory.getVerticalLayout(context);
        ShapeElement element = getLineElement(hexColor, width);
        layout.setHeight(width);
        layout.setBackground(element);
        return layout;
    }

    /**
     * 获取一个 Line （直线）元素
     * 该元素不能直接在界面上显示，只能作为其他组件的背景元素
     * @param hexColor  颜色值 #FFFFFF
     * @param width  直线宽度
     * @return
     */
    public static ShapeElement getLineElement(String hexColor, Integer width){
        ShapeElement shape = new ShapeElement();
        shape.setStroke(width,ColorFactory.getRgbColor(hexColor));
        shape.setShape(ShapeElement.LINE);
        return shape;
    }

    /**
     * 获取一个矩形元素
     * @param hexColor 颜色值
     * @param radius  圆角半径
     * @return
     */
    public static ShapeElement getRectangleElement(String hexColor, Integer radius){
        ShapeElement shape = new ShapeElement();
        shape.setRgbColor(ColorFactory.getRgbColor(hexColor));
        shape.setCornerRadius(radius);
        return shape;
    }
}
