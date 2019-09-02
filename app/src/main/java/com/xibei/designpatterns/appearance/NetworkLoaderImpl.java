package com.xibei.designpatterns.appearance;

import android.graphics.Bitmap;
import android.util.Log;

import static com.xibei.designpatterns.Constant.XBLOG_TAG;

/**
 * Created by Xibei on 2019/9/2.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class NetworkLoaderImpl implements NetworkLoader {
    @Override
    public Bitmap getNetwork(String url) {
        Log.e(XBLOG_TAG,"网络获取");
        return null;
    }
}
