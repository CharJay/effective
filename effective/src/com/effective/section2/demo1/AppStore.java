package com.effective.section2.demo1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务管理者（应用市场）
 */
public class AppStore {
    private AppStore() {
    }

    private static final Map<String, MusicProvider> providers=new ConcurrentHashMap<String, MusicProvider>();

    public static void registerProvider(String name, MusicProvider p) {
        providers.put(name, p);
    }

    public static MusicApp installApp(String name) {
        MusicProvider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name : " + name);
        }
        return p.getMusicApp();
    }
}
