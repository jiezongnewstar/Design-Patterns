package com.xibei.designpatterns.appearance;

/**
 * Created by Xibei on 2019/9/2.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class ImageLoad {

    private String params;
    private DiscCache mDiscCache;
    private MemoryCache mMemoryCache;
    private NetworkLoader mNetworkLoader;

    public ImageLoad(String params) {
        this.params = params;
        mDiscCache = new DiscCacheImpl();
        mMemoryCache = new MemoryCacheImpl();
        mNetworkLoader = new NetworkLoaderImpl();
    }


     public void loadImage(){
        mMemoryCache.getMemory(params);
        mDiscCache.getDisc(params);
        mNetworkLoader.getNetwork(params);

    }
}
