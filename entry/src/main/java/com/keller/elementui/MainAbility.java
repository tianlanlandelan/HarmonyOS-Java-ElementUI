package com.keller.elementui;

import com.keller.elementui.example.ListContainerSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ListContainerSlice.class.getName());
    }
}
