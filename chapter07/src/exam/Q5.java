package exam;

public class Q5 {

	public static void main(String[] args) {
		
		int sum= 0;
		int[] scores = {1,2,3,4,5,6,7,8,9,10}; 
		//int scores[] = {1,2,3,4,5,6,7,8,9,10};
		//int scores[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//int scores[] = new int[10] {1,2,3,4,5,6,7,8,9,10}; // ��ǻ�߻�
		
		int[] scores01 = new int[10]; // �迭 ����, ����
		scores01[0] = 1;	// �迭 �߱�ȭ : �迭�� �ε��� (���ȣ), �⺻���� �Ҵ�.
		scores01[1] = 2;
		scores01[2] = 3;
		scores01[3] = 4;
		scores01[4] = 5;
		scores01[5] = 6;
		scores01[6] = 7;
		scores01[7] = 8;
		scores01[8] = 9;
		scores01[9] = 10;
		
		for (int i =0 ; i < scores.length; i++) {
			sum += scores[i];   // sum = sum + scores[i];
		}
			
			System.out.println("1���� 10 ������ ���� :" + sum);	
			System.out.println(scores.length);
	}

}