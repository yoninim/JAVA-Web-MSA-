package kosta.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account obj,obj2,obj3;
		obj = new Account("1111-111" , "홍길동", 1000);
		obj2 = new Account("2222-222" , "박길동", 5000);
		obj3 = new Account();
		//new연산자가 객체를 만들어서 메모리가 할당되면 obj가 참조한다. 생성된 객체들의 
		//각각 객체를 만들때마다 메모리가 새로 생성된다
		
//		obj.accountNo ="1111-111";
//		obj.ownerName = "홍길동";
//		obj.balance =1000;
		
		obj.deposit(500);
		System.out.println("계좌번호 :" + obj.accountNo);
		System.out.println("계좌주 :" + obj.ownerName);
		System.out.println("잔액 :" + obj.balance);
		System.out.println("계좌번호 :" + obj2.accountNo);
		System.out.println("계좌주 :" + obj2.ownerName);
		System.out.println("잔액 :" + obj2.balance);
		
		
	}

}
