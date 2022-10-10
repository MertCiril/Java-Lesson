package interfaces;

public class CustomerManager {
	private ILogger[] loggers;
	
	public CustomerManager(ILogger[] loggers) {	
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Customer added: "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Customer deleted: "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
