package inheritance;

public class ColerPoint extends Point {

	private String color ;     // ���� ��
	
	// public ColerPoint (){};		// ������(�⺻ ������)
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();				//point Ŭ������ �޼ҵ� ȣ�� 
	}
	
	

	
	/*
	public static void main(String[] args) {
		
	Point p = new Point();
	
	p.x = 1;
	p.y = 2;
	
}
*/
}