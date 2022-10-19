package Super;

public class Class2 extends Class1 {

	String a ="class2 a"; //common variable
	static String b = "class2 satic b"; // common static variale
	String e ="class2 e";
	static String f = "class2 staticf";
	Class2(){
		super(); //calling to parent clas constructor
		System.out.println("class2 constructor");
		//calling togloble variable currnt class
		
		System.out.println(this.a);
		System.out.println(this.b);
	}
	//common method
	void m1() {
		System.out.println("class m1");
	}
	static void m2() {
		System.out.println("class m2");
	}
	static void m5() {
		System.out.println("class m5");
	}
	void m6 () {
		System.out.println("class m6");
	}
}
