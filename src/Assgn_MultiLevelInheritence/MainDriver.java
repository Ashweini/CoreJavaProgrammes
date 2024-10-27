package Assgn_MultiLevelInheritence;

public class MainDriver {

	public static void main(String[] args) {


		Reader r1 = new Reader("Harry Potter","Automic Habbits");
		
		//r1 to get the author of book
		System.out.println(r1.NewsPaper);  //null not assigned any data
		
		//r1 types of book
		System.out.println(r1.Fiction);  // Harry Potter - takes from constructor by referring object reference var
		System.out.println(r1.Non_Fiction);//Automic Habbits - takes from constructor by referring object reference va
		
		//call method 
		r1.getAuthors();  //Library class - method
		
		//Books class methods 
		r1.Display(); //Book class method

	}

}
