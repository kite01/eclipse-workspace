package hiding;

public class Student {
	int studentID;
    private String studentName;  // �ٸ� Ŭ���� ���� ����(x)
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String s) {
		studentName = s;
	}
	


}
