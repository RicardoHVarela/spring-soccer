package com.tentlevarela.soccer;

public class FCBService implements TeamService {

	@Override
	public String getName() {
		return "FC Barcelona";
	}

	@Override
	public String getStadium() {
		return "Camp Nou";
	}

	@Override
	public String getCity() {
		return "Barcelona City";
	}

}
