package inheritance6;

public class VIPCustomerOLD {

	private int customerID;		// �� ���̵�
	private String customerName;	//���̸�
	private String customerGrade;	//�� ���( VIP, Gold, Silver....)
	int bonusPoint;					// ����Ʈ ����
	double bonusRatio;				// ����Ʈ ���� ����, ���� ����
	
	private int agentID;	// VIP �� ���� ID 
	double saleRatio;		// VIP ���η�
	
	public VIPCustomerOLD () {
		customerGrade = "VIP";	// �⺻ ���
		bonusRatio = 0.05;		// ���ʽ� ����Ʈ �⺻ ���� ���� (5%)
		saleRatio = 0.1;		// ������ 10%
	}
		
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;	// ����Ʈ ����		
		return price - (int)(price *saleRatio);			// 10% �� ���ε� ����
	}
	
	public int getAgentID() {			// VIP ���� ���� Agent ID
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint 
				+ "�Դϴ�. " ;
	}
	
}
