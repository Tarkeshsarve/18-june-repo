package testpackage;

public class MainClass {

	public static void main(String[] args) {
		
		Constructor obj1 = new Constructor();
		System.out.println(obj1.a + " " + obj1.b );
		
		Constructor obj2 = new Constructor(45);
		System.out.println(obj2.a + " " + obj2.b);
		
		Constructor obj3 =new Constructor(30,60);
		System.out.println(obj3.a +" "+ obj3.b);
	}
	
	
}
