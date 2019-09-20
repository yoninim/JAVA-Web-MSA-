package kosta.mission;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		// 키보드로 부터 아이디와 비밀번호를 입력받아서
		// 아이디와 비밀번호가 일치하면 > 로그인 성공
		// 아이디 불일치 > 해당 아이디가 존재하지 않습니다.
		// 비밀번호 불일치 > 비밀번호가 일치하지 않습니다.

		Scanner sc = new Scanner(System.in);

		String m_id = "kosta";
		String m_pass = "1234";

		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 입력 : ");
		String pw = sc.nextLine();

		if (id.equals(m_id) && pw.equals(m_pass)) {
			System.out.println("로그인성공");
		} else {
			if (!id.equals(m_id)) {
				System.out.println("해당 아이디가 존재하지 않습니다");
			} else if (!pw.equals(m_pass)) {
				System.out.println("비밀번호가 일치하지 않습니다");
			}

		}
	}
}
