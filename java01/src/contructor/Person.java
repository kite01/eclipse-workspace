package contructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {};		// �⺻ ������ , ���� ����
				//Ŭ���� ���� �ٸ� �����ڰ� ���� �� 
				//���࿡ �⺻ �����ڸ� ȣ���ϸ� ����
	public Person(String pname) {
		name=pname;
	};
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
		
				
	}
	
}
