package staticex;

public class Student {
	
	public static int serialNum = 1000; // Ŭ���� ���� (����Ÿ ������ ����)
									//(��� �ν��Ͻ����� ����), ���α׷��� �ε� ����
									// ���α׷��� ���� �ɶ� ����
	int studentID;			//��� ����(�ν��Ͻ� ����)<== �������� ����
	String studentName;		//new Ű���带 ���ؼ� �ν��Ͻ� �����ÿ� �������� ����
	int grade;				//������ �÷��Ϳ� ���ؼ� ����
	String address;			//�� �ν��Ͻ� �������� ���, 
	
	/*
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}
	*/
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}



	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
