package staticex;

public class Student1 {
	
	public static int serialNum = 1000;
		// Ŭ���� ����, static ����
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student1(){
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
			//Ŭ���� �޼ҵ�, Static �޼ҵ�
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student1.serialNum = serialNum;
	}
}
