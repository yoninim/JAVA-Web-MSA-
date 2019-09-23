package kosta.oop;

public class Cosmetic {
	String cosName;
	int price;
	int quantity;
	
	public Cosmetic() {}
	
	public Cosmetic(String cosName, int price, int quantity) {
		this.cosName = cosName;
		this.price = price;
		this.quantity= quantity;
	}
	
	public int release(int num) {
		if(quantity<num) {
			System.out.println("재고가 부족하여 출고할 수 없습니다");
			return 0;
		}
		quantity = quantity - num;
		return quantity;
	}
	
	public int shipment(int num) {
		price = price * num;
		if(price < 50000)
			price += 2500;
		
		return price;
	}
	
	public void print() {
		System.out.println("주문하신 제품은 " + cosName + "가격은 총 " + price + "주문 후 잔여 재고는" + quantity +"입니다");
	}
}
