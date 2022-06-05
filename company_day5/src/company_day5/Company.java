package company_day5;
public class Company {
	String name;

	public static void main(String[] args) {
				Company c = new Company() ;
				Company c1 = c;
				c1.name = "C2TC";
				c.name = null;
				System.out.println(c.name);
				}

		}
