package demo1;

public class Test2 {

	public static void main(String[] args) {
		Test1 t1= new Test1();
		//t1.show(); 		//error bcz private is not accessible within package
		/*
		 * t1.demo();//public access modifier within the package
		 */		
		
		 
		System.out.println(t1.i);
		 
		
	}

}
