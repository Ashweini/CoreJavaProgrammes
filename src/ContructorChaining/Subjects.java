package ContructorChaining;

public class Subjects {
	String Java;
	String Programming;
	String Selenium;
	
	Subjects(){
		System.out.println("Subjects and their topics");
	}

	Subjects(String Java){
		this();
		this.Java = Java;
	}
	
	Subjects(String Java, String Programming){
		this(Java);
		System.out.print("Java containss topic->");
		this.Programming=Programming;
	}
	
	Subjects(String Java, String Programming, String Seleinum){
		this(Java, Programming);
		this.Selenium=Selenium;
	}
}
