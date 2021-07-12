package chapter03;

public class OperatorEx15 {

	public static void main(String[] args) {
		int num = 0B00000101;	// 5
		
		System.out.println(num << 2); // 5 * 2^2 = 20
		System.out.println(num << 3); // 5 * 2^3 = 40
		System.out.println(num << 4); // 5 * 2^4 = 80
		System.out.println(num >> 1); // 5 / 2^1 = 2
		System.out.println(num >> 2); // 5 / 2^2 = 1
		System.out.println(num >>> 2); //5 / 2^2 = 1
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}
