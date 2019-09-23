package kosta.oop;

public class Book {
	String bookName;
	int fee;
	int dis ;
	
	public Book() {}
	
	public Book(String bookName, int fee) {
		this.bookName = bookName;
		this.fee = fee;
		
		discount();
	}
	
	public void discount() {
		if(fee>=30000) {
			dis = (int)(fee*0.75);
		}else if(fee>=20000) {
			dis = (int)(fee*0.75);
		}else if(fee >=15000) {
			dis = (int)(fee*0.75);
		}
	}
	
	public void print() {
		System.out.println(bookName+"교재는 정가는 " +fee+ "원 할인된 가격은" + dis + "원 입니다.");
	}
	
	
}
