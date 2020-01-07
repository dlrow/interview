package staticblock;

class A{
	static int a=8;
	static {
		System.out.println("static block of A");
	}
	
	public void A() {
		System.out.println("constuctor A");
	}
	
	public static void sum(int b) {
		System.out.println(b+a);
	}
}
public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("main");
		//A.a=3;

		A a = new A();//A.sum(5);
	}

}
