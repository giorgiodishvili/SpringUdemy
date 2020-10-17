package com.company;

public class BasketballCoach implements Coach{
    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BasketballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot 100 Shots";
    }

    @Override
    public String getDailyFortune() {
        return "BoomShakaLakaaa" + fortuneService.getFortune();
    }
}
