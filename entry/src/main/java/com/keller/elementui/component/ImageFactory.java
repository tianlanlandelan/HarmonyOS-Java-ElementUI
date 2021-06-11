package com.keller.elementui.component;

import com.keller.elementui.ResourceTable;
import com.keller.elementui.color.ColorEnums;
import ohos.agp.components.Image;
import ohos.app.Context;

/**
 * 图片
 * Image 工具类，构造常用的 Image 组件
 *
 * @author yangkaile
 * 2021-06-03 14:22:06
 *
 */
public class ImageFactory {


    /**
     * 根据资源ID获取图片
     * @param context
     * @param resourceId
     * @return
     */
    public static Image getImageByResourceId(Context context,int resourceId){
        Image image = init(context);
        image.setPixelMap(resourceId);
        return image;
    }

    /**
     *  TODO 访问 URL 图片资源
     *  https://harmonyos.51cto.com/answer/389
     * @param context
     * @param imgUrl
     * @return
     */
    public static Image getImage(Context context,String imgUrl){
        return init(context);
    }

    private static Image init(Context context){
        Image image = new Image(context);
        image.setWidth(200);
        image.setHeight(200);
        image.setScaleMode(Image.ScaleMode.CLIP_CENTER);

        return image;
    }
}
