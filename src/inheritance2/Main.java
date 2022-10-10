package inheritance2;

public class Main {

	public static void main(String[] args) {
		DatabaseLogger databaseLogger = new DatabaseLogger();
		EmailLogger emailLogger = new EmailLogger();
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(emailLogger);
		customerManager.add(databaseLogger);
		customerManager.add(new Logger());
		
		
		/*Logger[] loggers= {databaseLogger,emailLogger};
		for(Logger logger : loggers) {
			logger.log();
		}*/

	}

}
