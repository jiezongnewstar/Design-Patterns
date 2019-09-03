package com.xibei.designpatterns.adapter;

import android.util.Log;

import static com.xibei.designpatterns.Constant.XBLOG_TAG;

/**
 * Created by Xibei on 2019/9/3.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class USA extends USACharge {
    @Override
    public int usaCharge() {

        Log.e(XBLOG_TAG,"正在变压中....");

        return 220;
    }
}
