package chapter02;

public class CharacterEx02 {

	public static void main(String[] args) {
	
		char ch1 = 'ÇÑ';
		char ch2 = '\uD55C';	//À¯´ÏÄÚµå °ª (ÇÑ)
		char ch3 = '\uD56B';	//(ÇÖ)
		char ch4 = '\uAC38';	// (°¼)
		
		//char ch5 = -65;
		char ch6 = 65;
		
		System.out.println(ch1);	// 
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);

	}

}
