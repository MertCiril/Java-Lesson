package lessons;

public class Main {

	public static void main(String[] args) {
		//int String double boolean 
		
		//if yapısı
		
		//diziler/arrays
		String[] krediler = {
				"A Kredi",
				"B Kredi",
				"C Kredi",
				"D Kredi",
				"E Kredi"
				};
		
	/*	for(int i=0 ; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}*/
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		
	}

}
