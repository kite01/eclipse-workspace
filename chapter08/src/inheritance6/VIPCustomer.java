package inheritance6;

public class VIPCustomer extends Customer {
	

	private int agentID;	// VIP ���� ���� ID 
	double saleRatio;		// VIP ���η�
	
	public VIPCustomer () {
		//super(); 				// ���� Ŭ������ �����ڸ� ȣ�� , super() : ���� Ŭ������ �⺻ �����ڸ� ȣ��
		customerGrade = "VIP";	// �⺻ ���
		bonusRatio = 0.05;		// ���ʽ� ����Ʈ �⺻ ���� ���� (5%)
		saleRatio = 0.1;		// ������ 10%
	}

	public int getAgentID() {			// VIP ������ ���� Agent ID
		return agentID;
	}

}