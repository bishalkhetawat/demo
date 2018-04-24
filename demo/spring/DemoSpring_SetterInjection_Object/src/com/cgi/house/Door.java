package com.cgi.house;

public class Door
{
	
	private Bell bell;
	
	public Door()
	{
		
	}
	
	

	public Bell getBell() {
		return bell;
	}
    
	public void setBell(Bell bell) {
		this.bell = bell;
	}
	
	
	void pressDoorBell()
	{
		bell.ring();
		
	}
	
	

}
