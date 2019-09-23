package kosta.mission;

import java.util.Scanner;

public class Mission5 {
	public static void input(int[] arr, String[] subject) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print(subject[i] + "입력");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
		}
		arr[4] = arr[3] / 3;
	}

	public static void output(int[] arr, String[] subject) {
		for (String s : subject) {
			System.out.print(s + "\t");
		}
		System.out.println();

		for (int n : arr) {
			System.out.print(n + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 배열을 사용하여 성적관리 프로그램

		int grade[] = new int[5];
		String subject[] = { "국어", "영어", "수학", "평균", "총점"};

		input(grade, subject);
		output(grade, subject);

	}

}
