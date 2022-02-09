package assignments;

public class ConstructorDemo {
	String name;
	int rollNo;
	
	//Parametrized Constructor
	public ConstructorDemo(String nav, int no)
	{
		this.name = nav;
		this.rollNo = no;
	}
	
	//Non-Parametrized Constructor
	public ConstructorDemo()
	{
		this.name = "Default";
		this.rollNo = 3;
	}

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo("Test",1);
		System.out.println(obj.name+" "+obj.rollNo);
		ConstructorDemo obj2 = new ConstructorDemo();
		System.out.println(obj2.name+" "+obj2.rollNo);
	}

}
