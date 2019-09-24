package kosta.phone;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. 추가 2. 전체출력 3. 종료
		Manager m = new Manager();
//		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 추가 2. 전체출력 3. 검색 ,4.종료");
			System.out.println("메뉴입력");
			int n =  DataInput.sc.nextInt();
			switch (n) {
			case 1:
				m.addPhoneInfo();
				break;
			case 2:
				m.listPhoneInfo();
				break;
			case 3:
				m.searchPhoneInfo();
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;

			}

		}
	}
}
