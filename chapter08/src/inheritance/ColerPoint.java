package inheritance;

public class ColerPoint extends Point {

	private String color ;     // 점의 색
	
	// public ColerPoint (){};		// 생략됨(기본 생성자)
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();				//point 클래스의 메소드 호출 
	}
	
	

	
	/*
	public static void main(String[] args) {
		
	Point p = new Point();
	
	p.x = 1;
	p.y = 2;
	
}
*/
}
