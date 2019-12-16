package com.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
private FortuneService fortuneservice;

@Autowired
public TennisCoach(FortuneService fortuneservice) {
	this.fortuneservice=fortuneservice;
}
	@Override
	public String getDailyWorkout() {

		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getDailyFortune();
	}

}
