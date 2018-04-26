package com.tentlevarela.soccer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoccerApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Team fcb = context.getBean("myTeam",Team.class);

		System.out.println( fcb.getName() );
		System.out.println( fcb.getStadium());
		System.out.println( fcb.getCity() );

		context.close();
		
	}

}
