package com.tentlevarela.soccer;

public class Barcelona implements Team {

	private FCBService fcb;
	
	public Barcelona() {
		
	}
	
	public Barcelona(FCBService fcb) {
		this.fcb = fcb;
	}

	@Override
	public String getName() {
		return fcb.getName();
	}

	@Override
	public String getStadium() {
		return fcb.getStadium();
	}

	@Override
	public String getCity() {
		return fcb.getCity();
	}
	

}
