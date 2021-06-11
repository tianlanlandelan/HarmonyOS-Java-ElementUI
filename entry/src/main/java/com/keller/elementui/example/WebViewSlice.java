package com.keller.elementui.example;

import com.keller.elementui.component.WebViewFactory;
import com.keller.elementui.template.TemplateSlice;
import ohos.agp.components.webengine.WebView;

/**
 * @author yangkaile 2021-06-02 10:33:05
 * 文本框组件
 */
public class WebViewSlice extends TemplateSlice {
    @Override
    public void initTemplate() {
        String htmlStr = "<h1>哈哈</h1><img src='https://fanyi-cdn.cdn.bcebos.com/static/translation/img/header/logo_e835568.png'>";

        WebView webView = WebViewFactory.getWebViewByHtml(getContext(),htmlStr);
        layout.addComponent(webView);
    }
}
