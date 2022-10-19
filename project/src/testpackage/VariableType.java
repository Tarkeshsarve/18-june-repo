package testpackage;

public class VariableType {

	int a =10;
	static int b;
	
	public static void main(String[] args) {
	VariableType obj = new VariableType();
	obj.m1();
	obj.m2();
	}
	
      void m1() {
    	  int a;
    	  a = 20;
    	  System.out.println(this.a);
    	  this.a = a;
    	  System.out.println(this.a);
    	  System.out.println(this.b);
      }
      void m2() {
    	  a = 40;
    	  this.b= 50;
    	  System.out.println(a);
    	  System.out.println(b);
      }
}
