package interfaces;

public class Main {

	public static void main(String[] args) {
		
		ILogger[] loggers = {new SmsLogger(),new DatabaseLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer mert = new Customer(1,"Mert","Çiril");
		
		customerManager.add(mert);
		

		
	}

}
