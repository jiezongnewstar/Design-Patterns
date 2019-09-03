package com.xibei.designpatterns.adapter;

import android.util.Log;

import static com.xibei.designpatterns.Constant.XBLOG_TAG;

/**
 * Created by Xibei on 2019/9/3.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class ChargeAdapter extends ChinaCharge {


    private USACharge usaCharge;

    public ChargeAdapter(USACharge usaCharge) {
        this.usaCharge = usaCharge;
    }

    @Override
    public void chinaCharge() {
        //达到220伏才可以在中国使用

        if (usaCharge.usaCharge() == 220){
            Log.e(XBLOG_TAG,"电压达标，可以使用");
        }else {
            Log.e(XBLOG_TAG,"电压不达标，不可以使用");
        }
    }
}
