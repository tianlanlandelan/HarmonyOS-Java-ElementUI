package com.keller.elementui.entry;

import lombok.Data;
import ohos.aafwk.ability.AbilitySlice;

@Data
public class SampleItem <T extends AbilitySlice>{

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    private T clazz;

    public SampleItem(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public SampleItem(String name, String description,T clazz) {
        this.name = name;
        this.description = description;
        this.clazz = clazz;
    }
}
