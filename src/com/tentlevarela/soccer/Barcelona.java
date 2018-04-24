package com.tentlevarela.soccer;

public class Barcelona implements Team {

	private LaLigaService liga;
	
	public Barcelona() {
		
	}
	
	public Barcelona(LaLigaService liga) {
		this.liga = liga;
	}
	
	@Override
	public String getInfo() {
		return "FC Barcelona";
	}

	@Override
	public String getTrophies() {
		Barcelona b = new Barcelona();
		return "Trophies: " + liga.getTrophies(b);
	}

}
