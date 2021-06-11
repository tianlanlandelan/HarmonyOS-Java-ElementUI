package com.keller.elementui.color;

public enum ColorEnums {
    Main("#409EFF"),
    Success("#67C23A"),
    Warning("#E6A23C"),
    Danger("#F56C6C"),
    Info("#909399"),
    MainText("#303133"),
    CommonText("#606266"),
    PlaceHolderText("#C0C4CC"),
    White("#FFFFFF"),
    Black("#000000")
    ;

    public String value;

    ColorEnums(String value) {
        this.value = value;
    }
}
