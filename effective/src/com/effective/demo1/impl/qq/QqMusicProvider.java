package com.effective.demo1.impl.qq;

import com.effective.demo1.MusicApp;
import com.effective.demo1.MusicProvider;


//qq音乐服务提供者实现
public class QqMusicProvider implements MusicProvider {
    @Override
    public MusicApp getMusicApp() {
        boolean isDeviceAndroid = true;
        if (isDeviceAndroid) {
            return new QqMusicApp();
        }else {
            return new QqMusicPC();
        }
    }

}
