package com.company;

public class BaseballCoach implements Coach {

    //define a private field;
    private FortuneService fortuneService;
    public BaseballCoach() {
    }

    //define a constructor
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
