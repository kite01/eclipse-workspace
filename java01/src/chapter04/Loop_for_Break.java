package chapter04;

public class Loop_for_Break {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		for ( num =0; ;num++) {
			
			sum += num;	// sum = sum + num;
			 
			if (sum >= 100)
				break;
			
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	}

}
