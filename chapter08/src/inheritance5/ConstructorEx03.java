package inheritance5;
class A {
	public A() {
		System.out.println("������ A");
	}
	public A(int x) {
		System.out.println("�Ű����� ������ A");
	}
	public A(int x, int y) {
		System.out.println("�Ű����� ������ 2�� A");
	}
}
class B extends A {
	public B() {
		System.out.println("������ B");
	}
	public B(int x) {
		//super();
		//super(10);
		super(10,20);
		System.out.println("�Ű����� ������ B");
	}
}

public class ConstructorEx03 {
	public static void main(String[] args) {
		B b;
		b = new B(5);
	}

}