package com.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneservice;

	private String email;
	private String team;

	public CricketCoach() {
		System.out.println("cricketcoach:inside no-arg costructor");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {

		return fortuneservice.getDailyFortune();
	}

	public void setFortuneService(FortuneService fortuneservice) {
		System.out.println("cricketcoach:inside setFortuneservice");
		this.fortuneservice = fortuneservice;
	}

	public void setEmail(String email) {
		System.out.println("cricketcoach:inside setEmail");
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricketcoach:inside setTeam");
		this.team = team;
	}

}
