package chapter04;

public class Switch_If_convert {

	public static void main(String[] args) {
		String medal = "S";
		
		if ( medal =="Gold" || medal == "G" || medal == "Gol") {
			System.out.println("�ݸ޴� �Դϴ�.");
		}
		else if ( medal =="Silver" || medal == "S" || medal == "Sil") {
			System.out.println("���޴� �Դϴ�.");
		}		
		else if ( medal =="Bronze" || medal == "B" || medal == "Bro") {
			System.out.println("���޴� �Դϴ�.");
		}
		else  {
			System.out.println("�޴��� �����ϴ�.");
		}
	
	}

}
