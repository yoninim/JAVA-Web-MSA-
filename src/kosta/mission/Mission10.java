package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission10 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 입력 > 총점, 평균 산출
		// 2명 이상의 성적을 처리가 가능
		// 정렬, 출력

		Scanner sc = new Scanner(System.in);
		String subject[] = { "국어", "영어", "수학", "총점", "평균" };
		int arr[][] = new int[3][5];

		// 배열 초기화
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("학생" + (i + 1) + subject[j] + "입력 : ");
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
			}
			arr[i][4] = arr[i][3] / 3;
		}

		//선택정렬
		//1회전 :(1번 2번) > (1번 3번) > (1번 4번)
		//2회전 : (2번 3번) > (2번 4번)
		//3회전 : (3번 4번))
		
		// 정렬 [ 평균을 기준으로 내림차순 ]
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i][4] < arr[j][4]){
					int temp[];
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		
		//출력
		for(String s:subject) {
			System.out.print(s + "\t");
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
		}
			System.out.println();
		}
		
	}

}
