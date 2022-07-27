package com.sergeev.application.actual;

import com.sergeev.Utill.RandomUttils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("rockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        List<String> listSong = new ArrayList<>();
        listSong.add("Wind cries Mary");
        listSong.add("testRock");
        listSong.add("rockTest");
        return listSong.get(RandomUttils.getRandomNumber(listSong.size()));
    }
}
