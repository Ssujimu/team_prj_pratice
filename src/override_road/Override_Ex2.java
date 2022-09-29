package override_road;

class ProductStatus {
	void printSum() {
		System.out.println("1000원");
	}
}

class Product extends ProductStatus{
	void printSum() {
		System.out.println("2000원");
	}
}

public class Override_Ex2{
	public static void main(String[] args) {
		Product pp = new Product();
		
		pp.printSum();
		
	}
}
