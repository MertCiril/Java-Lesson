package inheritance2;

public class Customer {
	private int id;
	private String name;
	private String customerNo;
	public Customer(int id, String name, String customerNo) {
		super();
		this.id = id;
		this.name = name;
		this.customerNo = customerNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
}
