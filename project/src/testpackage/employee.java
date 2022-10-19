package testpackage;

public class employee {


	String name ;
	int employeeid;
	
	employee (String name ,int employeeid){
		this.name=name;
		this.employeeid = employeeid;
	}
	
	 public static void main(String[] args) {
		
		employee e1=new employee("tarkesh",100);
		 
		 employee e2=new employee("sanghdeep",101);
	 }	
}
 