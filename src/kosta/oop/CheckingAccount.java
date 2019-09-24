package kosta.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo)||balance <amount) {
			throw new Exception("지불이 불가능합니다");
		}
		
		return withdraw(amount);
	}
	

}
