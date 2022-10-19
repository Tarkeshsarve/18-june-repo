package inheritance;

public class Class2 extends Class1{
	
	int a=20;
	
	void show(int a) {
		
		// System.out.println(super.a);
		// System.out.println(this.a);
		   System.out.println(a);
	}
       public static void main(String[] args) {
		
    	   Class2 c = new Class2();
    	   c.show(30);
	}
	
}
