package com.tentlevarela.soccer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoccerApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Barcelona fcb = context.getBean("myTeam",Barcelona.class);

		System.out.println( fcb.getName() );
		System.out.println( fcb.getStadium());
		System.out.println( fcb.getCity() );
		System.out.println( fcb.getBestPlayer() );
		System.out.println( fcb.getTrophies() );
		
		context.close();
		
	}

}
