package interfaces;

/*başka bir sınıfın alt sınıfıysa extends (sadece bir sınıf extends edilebilir)
interface kullanılacaksa implements (birden fazla interface implements edilebilir)*/

public class SmsLogger implements ILogger{

	@Override
	public void log(String massage) {
		System.out.println("Sms Logged: "+ massage);
		
		
	}

}
