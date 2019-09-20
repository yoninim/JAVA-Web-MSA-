package kosta.mission;

import java.util.Scanner;

public class Mission9 {
	static int count = 0;

	public static void add(String[] fruits) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일을 추가하세요 ");
		String str = sc.nextLine();
		fruits[count++] = str;
	}

	public static void print(String[] fruits) {
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + ",");
		}
		System.out.println();
	}

	// 배열에 있는 과일을 검색하는 메서드
	// 과일명 => 인덱스 출력 / 없으면 존재하지 않습니다.
	public static void search(String[] fruits) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어를 입력하세요");
		String q = sc.nextLine();
		int index =-1;
		for (int i=0;i<count;i++) {
			if (fruits[i].equals(q)){
				index =i;	
		}
		}
		if (index != -1){
			System.out.println("주소값은 " + index);
		} else {
			System.out.println("존재하지 않습니다");
		}
		
	}

	public static void main(String[] args) {
		// 메뉴 선택 프로그램 구현하자.
		// 키보드에서 메뉴를 입력하면 해당 메뉴에 출력
		// 1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료
		// 과일들을 메뉴의 내용대로 실행해 보자.

		Scanner sc = new Scanner(System.in);
		String[] fruits = new String[10];

		while (true) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.println("메뉴입력 :");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				add(fruits);
				break;
			case "2":
				print(fruits);
				break;
			case "3":
				search(fruits);
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				return;
			}
		}
	}

}
