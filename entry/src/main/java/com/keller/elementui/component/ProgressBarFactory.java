package com.keller.elementui.component;

import com.keller.elementui.config.KellerConfig;
import ohos.agp.components.ProgressBar;
import ohos.agp.components.RoundProgressBar;
import ohos.app.Context;

/**
 * 进度条
 * @author yangkaile 2021-06-07 13:59:11
 */
public class ProgressBarFactory {

    public static ProgressBar getProgressBar(Context context,Integer progress){
        ProgressBar progressBar = init(context);
        progressBar.setProgressValue(progress);
        return progressBar;
    }


    public static RoundProgressBar getRoundProgressBar(Context context,Integer progress,Integer size){
        RoundProgressBar bar = initRound(context);
        bar.setProgressValue(progress);
        bar.setHeight(size);
        bar.setWidth(size);

        return bar;
    }

    private static ProgressBar init(Context context){
        ProgressBar progressBar = new ProgressBar(context);

        progressBar.setWidth(KellerConfig.MATCH_PARENT);

        return progressBar;
    }

    private static RoundProgressBar initRound(Context context){
        RoundProgressBar bar = new RoundProgressBar(context);
        bar.setWidth(100);
        bar.setHeight(100);


        return bar;
    }
}
