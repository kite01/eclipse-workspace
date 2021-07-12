package singleton;

public class Company {
	
	private static Company instance = new Company();
	private Company(){}			//Company��ü�� New Ű���带 ���ؼ� �������� ���ϵ��� ����
	
	public static Company getInstance() {
		
		if (instance == null) {			//null : ����ִ�. ���� ������ ���� �ʴ� ����.
			instance = new Company();
		}
		
		return instance;
	}

}
