package com.javacodegeeks.patterns.facadepattern;

public class TestFacade {

	public static void main(String[] args) {
		
		ScheduleServerFacade facadeServer = new ScheduleServerFacade(new ScheduleServer());
		facadeServer.startServer();
		
		System.out.println("Start working......");
		System.out.println("After work done.........");
		
		facadeServer.stopServer();
	}

}
