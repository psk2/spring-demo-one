package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	//	define a private field
	private FortuneService fortuneService;
	
	//	Create a no-arg constructor
	public CricketCoach() {
		System.out.println();
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
//		use my fortuneService to get a fortune
			return fortuneService.getFortune();
	}

}
