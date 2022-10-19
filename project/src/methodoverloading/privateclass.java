package methodoverloading;

public class privateclass {

	  void m1 (int a) {
		  System.out.println("m1");
		  
	  }
	  void m1 (String s,float f) {
		  System.out.println("tarkesh,15.12f");
	  }
	  void m1 (float f,String s) {
		  System.out.println("15.12f,tarkesh");
	  }
	  void m1 (char ch) {
		  System.out.println("m1");
	  }
}