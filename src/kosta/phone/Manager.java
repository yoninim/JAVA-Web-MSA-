package kosta.phone;

//import java.util.Scanner;

public class Manager {
	// 배열 선언, 생성
	phoneInfo arr[];
//	Scanner sc = new Scanner(System.in);
	static int count = 0;

	public Manager() {
		arr = new phoneInfo[10]; // Main에서 manager 클래스에있는 배열이나 메소드를 호출할 때 배열생성
	}

	public void addPhoneInfo() {
		System.out.println("이름 :");
		String name = DataInput.sc.nextLine();
		System.out.println("번호 :");
		String phoneNo =  DataInput.sc.nextLine();
		System.out.println("생일 :");
		String birth =  DataInput.sc.nextLine();

		arr[count++] = new phoneInfo(name, phoneNo, birth);
	}

	public void listPhoneInfo() {
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void searchPhoneInfo() {
		System.out.println("검색값을 입력하세요");
		String name =  DataInput.sc.nextLine();
		int index=-1;


		for (int i = 0; i < count; i++) {
				if (name.equals(arr[i].getName())) {
					arr[i].show();
					index=i;
			}
		}
		if(index == -1) {
			System.out.println("해당 전화 번호가 없습니다");
		}
	}

}
