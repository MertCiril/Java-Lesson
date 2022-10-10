package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer mert = new IndividualCustomer();
		mert.customerNumber = "1234";
		
		CorporateCustomer fiveta = new CorporateCustomer();
		fiveta.customerNumber ="5678";
		
		CustomerManager customerManager = new CustomerManager();
		
		/*customerManager.add(mert);
		customerManager.add(fiveta);*/
		Customer[] customers = {fiveta,mert};
		customerManager.addMultiple(customers);
		

	}

}
