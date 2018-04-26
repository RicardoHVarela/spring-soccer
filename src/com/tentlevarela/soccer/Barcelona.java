package com.tentlevarela.soccer;

public class Barcelona implements Team {

	private FCBService fcb;
	private String bestPlayer;
	private String trophies;
	
	public Barcelona() {
		
	}
	
//	public Barcelona(FCBService fcb) {
//		this.fcb = fcb;
//	}

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

	public FCBService getFcb() {
		return fcb;
	}

	public void setFcb(FCBService fcb) {
		this.fcb = fcb;
	}

	public String getBestPlayer() {
		return bestPlayer;
	}

	public void setBestPlayer(String bestPlayer) {
		this.bestPlayer = bestPlayer;
	}

	public String getTrophies() {
		return trophies;
	}

	public void setTrophies(String trophies) {
		this.trophies = trophies;
	}
	

}
