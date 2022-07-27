package com.sergeev.application.actual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music classicalMusic;
    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;
    @Autowired
    @Qualifier("rapMusic")
    private Music rapMusic;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playRandomMusic() {
        switch (MusicEnum.getRandomMusic()) {
            case RAP:
                System.out.println(rapMusic.getSong());
                break;
            case ROCK:
                System.out.println(rockMusic.getSong());
                break;
            case CLASSICAL:
                System.out.println(classicalMusic.getSong());
                break;
        }
    }

}