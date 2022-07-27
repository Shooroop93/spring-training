package com.sergeev.application.actual;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic firstMusicPlayer = context.getBean("musicBean3", ClassicalMusic.class);
        ClassicalMusic secondMusicPlayer = context.getBean("musicBean3", ClassicalMusic.class);

        System.out.println(firstMusicPlayer == secondMusicPlayer);

        System.out.println(firstMusicPlayer.getSong());

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer3 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer4 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer5 = context.getBean("musicPlayer", MusicPlayer.class);

        Music music = context.getBean("rockMusicBean", Music.class);
        Music classicMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        List<Music> musicList = new ArrayList<>();
        musicList.add(music);
        musicList.add(classicMusic);
        MusicPlayer musicPlayer = new MusicPlayer(musicList);

        System.out.println("------");
        musicPlayer.playMusicList();

        context.close();
    }
}
