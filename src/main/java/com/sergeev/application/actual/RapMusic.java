package com.sergeev.application.actual;

import com.sergeev.Utill.RandomUttils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        List<String> listSong = new ArrayList<>();
        listSong.add("hip hop lalala");
        listSong.add("testRap");
        listSong.add("rapTest");
        return listSong.get(RandomUttils.getRandomNumber(listSong.size()));
    }
}
