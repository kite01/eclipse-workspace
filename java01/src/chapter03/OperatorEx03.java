package chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		/*
		 * int lastScore1 = ++gameScore;  // ; 贸府傈俊 利侩
		 * System.out.println(lastScore1);
		 */
		int lastScore1 = gameScore++; 		// ; 饶俊 贸府
		System.out.println(lastScore1);		//150
		System.out.println(gameScore);		//151
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);		//151
		
		System.out.println(gameScore);		//150
		
		
	}

}
