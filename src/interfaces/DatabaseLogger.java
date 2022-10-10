package interfaces;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String massage) {
		System.out.println("Database Logged: "+massage);
		
	}

}
