package kosta.oop;

public class CheckingAccountMain {
	public static void main(String[] args) {
	CheckingAccount ca = new CheckingAccount("1111", "홍길동",1000,"1111");
	
	try {
		System.out.println("지불금액: "+ca.pay("1111", 400));
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("잔액:"+ca.balance);
	}
}
