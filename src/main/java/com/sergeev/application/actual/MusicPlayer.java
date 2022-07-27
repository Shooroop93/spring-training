package com.sergeev.application.actual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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