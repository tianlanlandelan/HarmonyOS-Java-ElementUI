package com.keller.elementui.example;

import com.keller.elementui.component.ListContainerFactory;
import com.keller.elementui.entry.SampleItem;
import com.keller.elementui.provider.TestProvider;
import com.keller.elementui.template.TemplateSlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.ListContainer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListContainerSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        initListContainer(layout);
    }


    private void initListContainer(DirectionalLayout layout) {
        ListContainer listContainer = ListContainerFactory.getListContainer(getContext());
        List<SampleItem> list = getData();
        TestProvider sampleItemProvider = new TestProvider(list, this);
        listContainer.setItemProvider(sampleItemProvider);

        //点击跳转
        listContainer.setItemClickedListener((container,component,position,id) ->{
            SampleItem item = (SampleItem) listContainer.getItemProvider().getItem(position);
            System.out.println(item.getDescription());
            present(item.getClazz(), new Intent());
        });

        layout.addComponent(listContainer);
    }
    private ArrayList<SampleItem> getData() {
        ArrayList<SampleItem> list = new ArrayList<>();

        SampleItem[] items = {
                new SampleItem<>("Text",                "Text是用来显示字符串的组件，在界面上显示为一块文本区域",new TextSlice()),
                new SampleItem<>("Button",              "Button是一种常见的组件，点击可以触发对应的操作",new ButtonSlice()),
                new SampleItem<>("TextField",           "TextField提供了一种文本输入框",new TextFieldSlice()),
                new SampleItem<>("Image",               "Image是用来显示图片的组件",new ImageSlice()),
                new SampleItem<>("TableList",           "Tablist可以实现多个页签栏的切换，Tab为某个页签",new TabListSlice()),
                new SampleItem<>("Picker",              "Picker提供了滑动选择器，允许用户从预定义范围中进行选择",new PickerSlice()),
                new SampleItem<>("DatePicker",          "DatePicker主要供用户选择日期",new DatePickerSlice()),
                new SampleItem<>("TimePicker",          "TimePicker主要供用户选择时间",new TimePickerSlice()),
                new SampleItem<>("Switch",              "Switch是切换单个设置开/关两种状态的组件",new SwitchSlice()),
                new SampleItem<>("RadioButton",         "RadioButton用于多选一的操作，需要搭配RadioContainer使用",new RadioButtonSlice()),
                new SampleItem<>("Checkbox",            "Checkbox可以实现选中和取消选中的功能",new CheckboxSlice()),
                new SampleItem<>("ProgressBar",         "ProgressBar用于显示内容或操作的进度",new ProgressBarSlice()),
                new SampleItem<>("RoundProgressBar",    "RoundProgressBar用于显示环形进度",new RoundProgressBarSlice()),
                new SampleItem<>("ToastDialog",         "ToastDialog是在窗口上方弹出的对话框，是通知操作的简单反馈",new TabListSlice()),
                //TODO
                new SampleItem<>("ScrollView",          "ScrollView是一种带滚动功能的组件，它采用滑动的方式在有限的区域内显示更多的内容",new TextSlice()),
                new SampleItem<>("ListContainer",       "ListContainer是用来呈现连续、多行数据的组件，包含一系列相同类型的列表项",new ListContainerSlice()),
                new SampleItem<>("PageSlider",          "PageSlider是用于页面之间切换的组件，它通过响应滑动事件完成页面间的切换",new TextSlice()),
                new SampleItem<>("PageSliderIndicator", "PageSliderIndicator，需配合PageSlider使用，指示在PageSlider中展示哪个界面",new TextSlice()),
                new SampleItem<>("WebView",             "WebView提供在应用中集成Web页面的能力",new WebViewSlice())
        };
        list.addAll(Arrays.asList(items));
        return list;
    }
}
