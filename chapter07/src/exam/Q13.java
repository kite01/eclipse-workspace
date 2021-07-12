package exam;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환전 돈을 unit 배열에 할당
		int money; 
		
		System.out.println("급액을 입력 하세요. >>");
		money = sc.nextInt();
		
		for (int i = 0 ; i < unit.length; i++) {
			System.out.printf("%d 원짜리: %d개 \n", unit[i], money/unit[i]);
				//첫번째 : %d = unit[i] , 두번째 : %d = money/unit[i]  
			money = money - (money / unit[i]) * unit[i];
		}
		sc.close();		
	}
}
