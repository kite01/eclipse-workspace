package chapter04;

public class Loop_for_continue_Ex {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		//for (int total = 0, int num = 1 ; num <= 100 ; num++){
		for (num =1 ; num <= 100; num ++) {
			
			if (num % 2 == 0)
				continue;
			
			total += num;	// total = total + num
			
		}
		System.out.println("1부터 100 까지의 홀수의 합은 " + total + "입니다");
	}

}
