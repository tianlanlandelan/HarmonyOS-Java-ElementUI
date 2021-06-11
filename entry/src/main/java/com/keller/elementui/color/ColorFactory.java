package com.keller.elementui.color;

import ohos.agp.colors.RgbColor;
import ohos.agp.utils.Color;

import java.math.BigInteger;

/**
 * @author yangkaile
 * 2021-06-02 12:11:21
 * 色彩工具，将 16 进制表示的色彩值，转换为 Color 对象
 */
public class ColorFactory {
    private int red;
    private int green;
    private int blue;

    public ColorFactory(String hexStr) {
        red = new BigInteger(hexStr.substring(1,3), 16).intValue();
        green = new BigInteger(hexStr.substring(3,5), 16).intValue();
        blue = new BigInteger(hexStr.substring(5,7), 16).intValue();
    }

    public static RgbColor getRgbColor(ColorEnums enums){
        return getRgbColor(enums.value);
    }

    /**
     * 将 16 进制表示的色彩值，转换为 RgbColor 对象
     * @param hexStr 16 进制色彩值，如 #FFFFFF
     * @return
     */
    public static RgbColor getRgbColor(String hexStr){
        ColorFactory color = new ColorFactory(hexStr);
        return  new RgbColor(color.red,color.green,color.blue);
    }

}
