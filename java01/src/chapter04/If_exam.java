package chapter04;

public class If_exam {

	public static void main(String[] args) {
		int score = 75;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
			System.out.println("����� ������" + score + "�Դϴ�. ������ " + grade + "�Դϴ�.");
		}
		else if (score >= 80) {
			grade = 'B';
			System.out.println("����� ������" + score + "�Դϴ�. ������ " + grade + "�Դϴ�.");
		}
		else if (score >= 70) {
			grade = 'C';
			System.out.println("����� ������" + score + "�Դϴ�. ������ " + grade + "�Դϴ�.");
		}
		else if (score >= 60) {
			grade = 'D';
			System.out.println("����� ������" + score + "�Դϴ�. ������ " + grade + "�Դϴ�.");
		}
		else {
			grade = 'F';
			System.out.println("����� ������" + score + "�Դϴ�. ������ " + grade + "�Դϴ�.");					
		}
		
	}

}
