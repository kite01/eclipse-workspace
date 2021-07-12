package chapter04;

public class Switch_If_convert {

	public static void main(String[] args) {
		String medal = "S";
		
		if ( medal =="Gold" || medal == "G" || medal == "Gol") {
			System.out.println("금메달 입니다.");
		}
		else if ( medal =="Silver" || medal == "S" || medal == "Sil") {
			System.out.println("은메달 입니다.");
		}		
		else if ( medal =="Bronze" || medal == "B" || medal == "Bro") {
			System.out.println("동메달 입니다.");
		}
		else  {
			System.out.println("메달이 없습니다.");
		}
	
	}

}
