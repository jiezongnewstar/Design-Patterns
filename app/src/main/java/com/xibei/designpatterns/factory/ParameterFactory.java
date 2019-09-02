package com.xibei.designpatterns.factory;

/**
 * Created by Xibei on 2019/8/30.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class ParameterFactory {

    public static Api createApi(String key){
        switch (key){
            case "name":
                return new ApiImpl_A();
            case "name&age":
                return new ApiImpl_B();
        }

        return null;
    }
}
