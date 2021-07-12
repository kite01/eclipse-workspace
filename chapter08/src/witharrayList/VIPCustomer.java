package witharrayList;

public class VIPCustomer extends Customer {
	

	private int agentID;	// VIP ���� ���� ID 
	double saleRatio;		// VIP ���η�( ��ǰ�� ������ ���� ����)
	
	
	public VIPCustomer (int customerID, String customerName, int agentID) {
		//super(); 				// ���� Ŭ������ �����ڸ� ȣ�� , super() : ���� Ŭ������ �⺻ �����ڸ� ȣ��
	
		super(customerID, customerName);
		customerGrade = "VIP";	// �⺻ ���
		bonusRatio = 0.05;		// ���ʽ� ����Ʈ �⺻ ���� ���� (5%)
		saleRatio = 0.1;		// ������ 10%
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);  // VIP ������ �� ���� ���� (10%)
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ���� ��ȣ�� " + agentID + " �Դϴ�";
	}
	
	public int getAgentID() {			// VIP ������ ���� Agent ID
		return agentID;
	}

}