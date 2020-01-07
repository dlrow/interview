package inheritance;

class Base {
	public void m1(double a) {
		System.out.println("base" + a);
	}
}

class Child extends Base {
	public void m1(int a) {
		System.out.println("child" + a);
	}
}

public class Test1 {

	public static void main(String[] args) {
		Base b = new Child();
		b.m1(23);
	}

}
