package polymophism2;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�. ");
	}	}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�. ");
	}}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�. ");
	}}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.movdAnimal1(new Human());
		aTest.movdAnimal2(new Tiger());
		aTest.movdAnimal3(new Eagle());
	}

	public void movdAnimal1 (Human h) {		// Human h = new Human();
		h.move();
	} 
	public void movdAnimal2 (Tiger t) {		// Tiger t = new Tiger();
		t.move();
	} 
	public void movdAnimal3 (Eagle e) {		// Eagle e = new Eagle();
		e.move();
	} 

}