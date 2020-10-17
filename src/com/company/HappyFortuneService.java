package com.company;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Happy Day Today!";
    }
}
