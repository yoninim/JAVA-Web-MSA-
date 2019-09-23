package kosta.oop;

public class Account {
	//공통된 데이터 구조
	//계좌번호 , 계좌주, 잔액 : 상태 > 멤버변수(필드,속성)
	String accountNo;
	String ownerName;
	int balance;
	
	//디폴트 생성자 (습관적으로 생성해주면 좋음)
	public Account() {}
	
	//생성자(Constructor) : 객체를 초기화
	public Account(String accountNo, String ownerName, int balance) {
	super();
	this.accountNo = accountNo;
	this.ownerName = ownerName;
	this.balance = balance;
}
	
	
	//공통된 기능 : 행동 > 멤버메소드(오퍼레이션)
	//입금하다. 출금하다.
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if(balance<amount) {
			return 0;
		}
		balance -= amount;
		return amount;
	}
}
