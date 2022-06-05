package java_day5;

public class CompanyName {
	String name;

	public static void main(String[] args) {
	CompanyName c1 = new CompanyName();
	c1.name = "C2TC";
	CompanyName c2 = c1;
	c1 = null;
	System.out.println(c2.name);
	CompanyName c3 = new CompanyName();
	c3.name = "C2TC";
	System.out.println(c3.name);

	}

}
