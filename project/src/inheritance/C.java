package inheritance;


public class C extends  B {
         
	  void showC ()
	  {
		System.out.println(" c method calling ");
	  }
	  
	 public static void main(String[] args) {
		
	
		C obj3 =new C();
		
		obj3.showA();
		obj3.showB();
		obj3.showC();
		
	  }  
}

