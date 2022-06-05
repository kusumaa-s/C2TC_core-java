package java_day5;

public class Test {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.start();
	}
	void start() {
	String stra = "do";
	String strb = method(stra);
	System.out.println(":" + stra + strb);
	}
	String method(String stra) {
		stra = stra + "good";
		System.out.println(stra);
		return "good";

	}

}
