package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.studentID = 20210728;
		
		// studentLee.studentName = "�̻��";
			//���۷��� ������ ���� �Ҵ�
		
		studentLee.setStudentName("�̻��");
			//Setter�� ���ؼ� �Ҵ�.
		
		System.out.println( studentLee.getStudentName());
				
	}

}
