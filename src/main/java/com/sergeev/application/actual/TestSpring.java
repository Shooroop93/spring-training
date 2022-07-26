package com.sergeev.application.actual;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);


//        musicPlayer.playMusicList();
        context.close();
    }
}
