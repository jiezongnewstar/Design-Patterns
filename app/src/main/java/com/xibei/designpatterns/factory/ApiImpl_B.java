package com.xibei.designpatterns.factory;

import android.util.Log;

import static com.xibei.designpatterns.Constant.XBLOG_TAG;

/**
 * Created by Xibei on 2019/8/30.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class ApiImpl_B implements Api {

    @Override
    public UserInfo create() {
        UserInfo userInfo = new UserInfo("xibei",27);
        Log.e(XBLOG_TAG,userInfo.toString());
        return null;
    }
}
