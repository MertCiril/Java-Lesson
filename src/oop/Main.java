package oop;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setDetail("16 gb");
		product1.setDiscount(20);
		product1.setName("Hp");
		product1.setUnitPrice(20);
		
		
		Product product2 = new Product();

		
		Product product3 = new Product(3,"Lenovo",8000,"8 Gb Ram",10);
		
		System.out.println("\n\n\n"+product3.getUnitPriceAfterDiscount());
		
		Product[] products= {
				product1,
				product2,
				product3
		};
		
		for(Product product : products) {
			System.out.println(product.getName());
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.setId(1);;
		category1.setName("Bilgisayarlar");
		
		Category category2 = new Category();
		category2.setId(2);;
		category2.setName("Telefonlar");;
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		
		

	}

}
