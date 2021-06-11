package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.webengine.WebView;
import ohos.app.Context;

/**
 * WebView
 * @author yangkaile 2021-06-07 14:02:03
 */
public class WebViewFactory {


    public static final String HTML = "text/html";


    public static WebView getWebViewByHtml(Context context,String htmlStr){
        WebView webView = init(context);
        webView.load(htmlStr,HTML,false);
        return webView;
    }


    public static WebView init(Context context){
        WebView webView = new WebView(context);
        webView.setWidth(KellerConfig.MATCH_PARENT);
        webView.setHeight(KellerConfig.MATCH_PARENT);
        return webView;
    }

}
