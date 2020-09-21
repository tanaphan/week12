package week12;

public class ConstructorOverloading {
	int a;
	double b;
	public ConstructorOverloading() {
		super();
		System.out.println("No argument constructor called.");
	}
	public ConstructorOverloading(int m) {
		a = m;
		
	}
	public ConstructorOverloading(int m, double n) {
		a = m;
		b = n;
	}
	public ConstructorOverloading(ConstructorOverloading s) {
		a = s.a;
		b = s.b;
	}
	void display() {
		System.out.println(a + " "+b);
	}
	public static void main(String[]args) {
		ConstructorOverloading std1= new ConstructorOverloading(11,12.5);
		ConstructorOverloading std2= new ConstructorOverloading(std1);
		System.out.format("a : %d, b : %f\n\n",std1.a,std1.b);
		std1.display();
		std2.display();
	}
}
