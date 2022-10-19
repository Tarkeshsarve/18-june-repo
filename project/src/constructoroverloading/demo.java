package constructoroverloading;

public class demo {

	demo(float f){
		System.out.println("float argument");
	}
	demo(int i){
		System.out.println("int argument");
	}
	demo(String s){
		System.out.println("string argument");
		
	}
	demo(double d){
		System.out.println("double argument");
	}
	
}
class Test{
	public void main(String[] args) {
		
		demo obj=new demo(15.20f);
		demo obj1=new demo(1);
		demo obj2=new demo("");
		demo obj3=new demo(4);
		
	}
}