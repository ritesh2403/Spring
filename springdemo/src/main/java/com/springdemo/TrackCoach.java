package com.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneservice;

	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	public TrackCoach() {

	}

	@Override
	public String getDailyWorkout() {

		return "run for 5km daily";
	}

	@Override
	public String getDailyFortune() {

		return fortuneservice.getDailyFortune();
	}
	
	//add an init method
	public void doMyStartUpstuff() {
		System.out.println("TrackCoach:inside method doMyStartUpstuff");
	}
	//add an destroy method
	public void doMyCleanUpstuffyoYo() {
		System.out.println("TrackCoach:inside method doMyCleanUpstuffyoYo");
	}

}
