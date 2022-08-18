package demo2;

import demo1.Test1;
/*public class Test3{*/		// protected does not access for outside the package

 public class Test3 extends Test1{ 

	public static void main(String[] args) {
		Test3 t2 =new Test3();
		//t1.show ();		// error private does not accessible outside the package and subclass
		/* t2.demo(); */	// public access
		System.out.println(t2.i);
		

	}

}
