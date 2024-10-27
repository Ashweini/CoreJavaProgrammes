package toStringMethod;

public class phone {
	
	int RAM;
	int ROM;
	
	phone(int RAM, int ROM){
		this.RAM=RAM;
		this.ROM=ROM;
	}
	
	public String toString() {
		return "[RAM : "+RAM+"GB"+" ,ROM : "+ROM+"GB"+"]";
		
	}

}
