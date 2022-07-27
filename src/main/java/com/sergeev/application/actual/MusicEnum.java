package com.sergeev.application.actual;

import com.sergeev.Utill.RandomUttils;

public enum MusicEnum {
    CLASSICAL("classical"),
    RAP("rap"),
    ROCK("rock");

    public String music;

    MusicEnum(String music) {
        this.music = music;
    }

    public static MusicEnum getRandomMusic() {
        MusicEnum[] values = MusicEnum.values();
        return values[RandomUttils.getRandomNumber(values.length)];
    }
}
