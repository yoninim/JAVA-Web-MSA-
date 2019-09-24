package kosta.video;

public class SpecialMember extends GeneralMember {
	private int bonusPoint;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String address,Video rentalVideo, int bonusPoint) {
		super(id, name, address,rentalVideo);
		this.bonusPoint = bonusPoint;
	}
	
	public void printBonus() {
		System.out.println("회원의 보너스 포인트 적림"+bonusPoint);
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
}
