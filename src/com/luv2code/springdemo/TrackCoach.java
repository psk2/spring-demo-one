package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	//	define a private field
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	//	Define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		//	use my fortuneService to get a fortune
		return "just do it: " + fortuneService.getFortune();
	}

}
