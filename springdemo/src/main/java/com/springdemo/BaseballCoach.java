package com.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneservice;
	
	public BaseballCoach() {
		
	}
	public BaseballCoach( FortuneService fortuneservice){
		this.fortuneservice=fortuneservice;
	}
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 min on battling practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getDailyFortune();
	}
}
