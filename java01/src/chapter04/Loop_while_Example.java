package chapter04;

public class Loop_while_Example {

	public static void main(String[] args) {
		int num = 1;		// num : 1~ 10 까지 
		int sum = 0;		// sum : 합한 결과를 담은 변수 
		
		while (num <= 10) {
			sum += num;			// sum = sum + num
			num++;
		}
		System.out.println("1부터 10 까지의 합은 " + sum + "입니다. ");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
