package Encapsulation;

public class ATM {
	
	private int atmid;
	private String location;
	private double money;
	
	//setter method
	public void setATMid(int atmid) {
		this.atmid = atmid;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public void setMoney(double money) {
		this.money=money;
	}
	
	//getter mothod
	public int getatmid() {
		return atmid;
	}
	
	public String getlocation() {
		return location;
	}
	
	public double getmoney() {
		return money;
	}

}
