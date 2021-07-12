package polymophism4;

import java.util.ArrayList;

class Animal{
	public void move()
	{		System.out.println("������ �����Դϴ�.");
	}}
class Human extends Animal{
	public void move()
	{		System.out.println("����� �� �߷� �Ƚ��ϴ�. ");	}	
	public void readBook()
	{
		System.out.println("����� å�� �н��ϴ�. ");
	}}

class Tiger extends Animal{
	public void move()
	{		System.out.println("ȣ���̰� �� �߷� �ݴϴ�. ");
	}	
	public void hunting() 
	{		System.out.println("ȣ���̰� ����� �մϴ�. ");
	}}

class Eagle extends Animal{
	public void move()
	{		System.out.println("�������� �ϴ��� ���ϴ� ");
	}	
	public void flying() 
	{		System.out.print("�������� ������ �� ��� �ָ� ���ư��ϴ�");
	}}

public class AnimalTest1 {
	
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.addAnimal();
		System.out.println("���� Ÿ������ �ٿ� ĳ���� ");
		aTest.testCasting();

	}
	
	public void addAnimal()
	{
		aniList.add(new Human());    //ArrayList�� �߰��Ǹ鼭 Animal������ �� ��ȯ
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList){     // �迭�� ��ҵ��� Animal������ ������ move ȣ���ϸ�
			ani.move();              // �������̵��� �Լ��� ȣ�� ��
		}
	}

	
	public void testCasting()
	{
		for(int i=0; i<aniList.size(); i++){  //��� �迭 �׸���� �ϳ��� ���鼭
			
			Animal ani = aniList.get(i);        // �ϴ� Shape Ÿ������ ������
			if(ani instanceof Human){       //Circle�̸�
				Human h = (Human)ani;      //Circle������ �ٿ� ĳ����
				h.readBook();
			}
			else if(ani instanceof Tiger){  
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle){
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else{
				System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			}
		}
	} 

}


