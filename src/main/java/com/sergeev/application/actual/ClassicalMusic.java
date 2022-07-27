package com.sergeev.application.actual;

import com.sergeev.Utill.RandomUttils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    private ClassicalMusic () {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    private void doMyInit() {
        System.out.println("Doing my initialization");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        List<String> listSong = new ArrayList<>();
        listSong.add("Hungarian Rhapsody");
        listSong.add("testClassical");
        listSong.add("classicalTest");
        return listSong.get(RandomUttils.getRandomNumber(listSong.size()));
    }
}
