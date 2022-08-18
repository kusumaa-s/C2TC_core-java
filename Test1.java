package demo1;

public class Test1 {
	protected  int i=10;
	 //private void show()		//private access in class
		/* public void demo() */
	{ System.out.println("Hello world");
	}
	
	public static void main(String[] args) {
		Test1 t1= new Test1();
		//t1.show();			//private within class
		/*
		 * t1.demo();// public within the class
		 */		System.out.println(t1.i);
		
		

	}

}
