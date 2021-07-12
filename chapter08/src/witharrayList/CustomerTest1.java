package witharrayList;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customeKim = new VIPCustomer();
		customeKim.setCustomerID(10020);
		customeKim.setCustomerName("김유신");
		customeKim.bonusPoint = 10000;
		System.out.println(customeKim.showCustomerInfo());
	}

}
