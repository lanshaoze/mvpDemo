package com.baozi.mvp.model;

import android.support.annotation.DrawableRes;

/**
 * Created by Administrator on 2017/8/16 0016.
 */

public interface PagerModel {

    Class[] getFragments();

    String[] getTabString();

    @DrawableRes
    int[] getTabDrawables();

    boolean isAnimation();
}
