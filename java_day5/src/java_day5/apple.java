package java_day5;

public class apple {
	int weight;
	public static void main(String[] args) {
		apple a1 = new apple();
		apple a2 = new apple();
		a1.weight = 1;
		a2.weight = 2;
		a2 = a1;
		System.out.println(a2.weight);
		}
}
