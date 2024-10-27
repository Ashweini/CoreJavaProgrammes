package Encapsulation;

public class ATMDriver {

	public static void main(String[] args) {

		ATM a = new ATM();
		a.setATMid(123);
		a.setLocation("Bangalore");
		a.setMoney(1500.89);
		
		System.out.println("ATM id : "+a.getatmid());
		System.out.println("Location : "+a.getlocation());
		System.out.println("Money : "+a.getmoney());

	}

}
