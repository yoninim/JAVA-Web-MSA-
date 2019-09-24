package kosta.video;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v1 = new Video(1,"엑시트","조정석");
		Video v2 = new Video(2,"살인의 추억","송강호");
		
		GeneralMember arr[]= {
				new GeneralMember("aaa","홍길동","동탄",v1),
				new SpecialMember("bbb","김철수","서울",v2,10)
		};
		
		arr[0].show();
		System.out.println();
		arr[1].show();
		SpecialMember sp = (SpecialMember)arr[1];
		sp.printBonus();
		}

}
