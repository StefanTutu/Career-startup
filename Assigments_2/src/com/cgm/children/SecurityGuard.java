package com.cgm.children;

import com.cgm.parent.Person;

public class SecurityGuard extends Person{
	
	private boolean allowedPortGun=false;
	private int workHours = 0;
	private String round = "";
	
	public boolean isAllowedPortGun() {
		return allowedPortGun;
	}
	public void setAllowedPortGun(boolean allowedPortGun) {
		this.allowedPortGun = allowedPortGun;
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
	
	
	@Override
	public String toString() {
		return "SecurityGuard [allowedPortGun=" + allowedPortGun + ", workHours=" + workHours + ", round=" + round
				+ ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getAge()=" + getAge() + "]";
	}
	@Override
	public String DoActivity() {
		System.out.println("A");
		return "Guard hours";
	}
	@Override
	public int payment() {
		System.out.println("Payment for security guard");
		return 0;
	}
	
	

}
