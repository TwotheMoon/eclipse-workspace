package Quiz43;

public abstract class Product {
	String name;
	int	price;
//	Product(){
//		System.out.println("고양이");
//	}
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	String getPriceWon() {
		return price + "원";
	}
}

