package com.xibei.designpatterns.factory;

import android.content.Context;

import com.xibei.designpatterns.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Xibei on 2019/9/2.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class PropertiesFactory {

    public static Api createApi(Context context) {
        //加载配置文件

        Properties properties = new Properties();

        try {
            //如果配置文件放在app/src/main/assets文件中
            InputStream inputStreamAssets = context.getAssets().open("config.properties");


            //如果配置文件放在app/src/main/res/raw文件中
//            InputStream inputStreamRaw = context.getResources().openRawResource(R.raw.config);


            //java的写法
//            InputStream inputStreamJava = PropertiesFactory.class.getResourceAsStream("assets/config.properties");

            properties.load(inputStreamAssets);

            Class clazz = Class.forName(properties.getProperty("create_b"));
            return (Api) clazz.newInstance();


        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }




}
