package witharrayList;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customeKim = new VIPCustomer();
		customeKim.setCustomerID(10020);
		customeKim.setCustomerName("������");
		customeKim.bonusPoint = 10000;
		System.out.println(customeKim.showCustomerInfo());
	}

}
