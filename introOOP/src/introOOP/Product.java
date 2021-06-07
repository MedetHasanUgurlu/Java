package introOOP;

public class Product {
	
	
	public Product(int id,String name,double unitPrice, String detail) {
		this.id =id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		System.out.println("Ben calıstım");
		
	}
	public Product() {}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;

}
