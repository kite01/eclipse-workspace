package polymophism;

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
		aTest.movdAnimal(new Human());
		aTest.movdAnimal(new Tiger());
		aTest.movdAnimal(new Eagle());
	}
	public void movdAnimal (Animal animal) {	// Animal animal = new Human(); // ��ĳ����
		animal.move();							// Animal animal = new Tiger(); // ��ĳ����
	}											// Animal animal = new Eagle(); // ��ĳ����
}
