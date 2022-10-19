package testpackage;

public class Testclass2 {
public static void main(String[] args) {
	
	int a=10;
	int b=20;
	//  ladder if
	if(a>b) 
	{
		System.out.println("1st if"); //execute if condition 1= true
	
	}else if(a>b) {
		System.out.println("2nd if");//execute if condition 1= false
		                                         //condition 2=true
		
	}else if(a>b) {
		System.out.println("3rd if"); //execute if condition 1=false
		                                         //condition 2=false
		                                         //condition 3=true
		
	}else {
		System.out.println("else"); //execute if condition 1=false
		                                        //condition 2=false
		                                        //condition 3=false
		
	}

}
}
