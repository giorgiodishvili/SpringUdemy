package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {
    private String[] fortune = new String[]{"Happy","Awesome","Unlucky"};

    @Override
    public String getFortune() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, fortune.length);
        return fortune[randomNum];
    }
}
