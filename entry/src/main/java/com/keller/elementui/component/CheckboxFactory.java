package com.keller.elementui.component;

import com.keller.elementui.ResourceTable;
import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.Checkbox;
import ohos.agp.components.ComponentState;
import ohos.agp.components.Text;
import ohos.agp.components.element.Element;
import ohos.agp.components.element.PixelMapElement;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.components.element.StateElement;
import ohos.app.Context;
import ohos.global.resource.NotExistException;
import ohos.global.resource.Resource;
import ohos.media.image.PixelMap;
import ohos.media.photokit.metadata.AVStorage;

import java.io.IOException;

/**
 * 复选框
 * @author yangkaile
 * 2021-06-07 13:57:59
 */
public class CheckboxFactory {

    public static Checkbox getCheckbox(Context context,String text){
        Checkbox checkbox = init(context);
        checkbox.setText(text);
        return checkbox;
    }

    /**
     * TODO 初始化基本样式
     * @param context
     * @return
     */
    private static Checkbox init(Context context){
        Checkbox checkbox = new Checkbox(context);
        checkbox.setTextSize(KellerConfig.TEXT_SIZE_18, Text.TextSizeType.FP);

        try {
            PixelMapElement checkedElement = new PixelMapElement(
                    context.getResourceManager().getResource(ResourceTable.Media_icon));

            PixelMapElement noCheckElement = new PixelMapElement(
                    context.getResourceManager().getResource(ResourceTable.Media_java));


            StateElement stateElement = new StateElement();
            stateElement.addState(new int[]{18432},checkedElement);
            stateElement.addState(new int[]{18496},noCheckElement);

            checkbox.setButtonElement(noCheckElement);

            checkbox.setComponentStateChangedListener((c,v)->{
                System.out.println("=========");
                System.out.println(v);

                if(v == 18432){
                    checkbox.setButtonElement(checkedElement);
                }
                if(v == 18496){
                    checkbox.setButtonElement(noCheckElement);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotExistException e) {
            e.printStackTrace();
        }

        return checkbox;
    }
}
