package kosta.mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {
		// 배열을 이용하여 각 사람의 키를 입력받아
		// 가장 큰 키를 출력하시오.
		Scanner sc = new Scanner(System.in);

		System.out.println("학생수 입력: ");
		int num = sc.nextInt();
		int height[] = new int[num];

		for (int i = 0; i < height.length; i++) {
			System.out.print("학생" + (i + 1) + "의 키를 입력 하세요");
			height[i] = sc.nextInt();
		}
		System.out.println("최장신은" + maxOf(height) + "cm입니다");
	}

	public static int maxOf(int h[]) {
		int max = h[0];
		for (int i = 1; i < h.length; i++) {
			if (h[i] > max) {
				max = h[i];
			}
		}
		return max;
	}
}
