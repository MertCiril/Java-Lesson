package interfaces;

/*sık kullanılan fonksiyonlar utils adındaki classta tutulur*/

public class Utils {
	public static void runLoggers(ILogger[] loggers,String message) {	
		/*bu fonksiyonu new kullanmadan çağırmak için static yaptık*/
		for(ILogger logger: loggers) {
			logger.log("Logged by customer: "+message);
		}
	}
}
