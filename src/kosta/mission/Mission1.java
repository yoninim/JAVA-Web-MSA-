package kosta.mission;

import java.util.Scanner;

public class Mission1 {

	public static int sumGrade(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	public static int totalAvg(int a, int b, int c) {
		int total = (a + b + c) / 3;
		return total;
	}

	public static void main(String[] args) {
		// 성적관리 프로그램을 구현하자.
		// 국어, 영어, 수학 점수 입력 받을 수 있는 변수를 선언
		// 변수에 적절히 초기화 하자.
		// 총점과 평균을 구하자.
		// 총점과 평균을 출력해 보자.
		// 조건문을 이용하여 학점 출력

		Scanner sc = new Scanner(System.in);

		int kor, eng, math;
		int sum, avg;
		char grade = 0;

		System.out.println("국어 : ");
		kor = sc.nextInt();

		System.out.println("영어 : ");
		eng = sc.nextInt();

		System.out.println("수학 : ");
		math = sc.nextInt();

//		sum=kor+eng+math;
//		avg=(int)(sum/3.0);
		
		sum = sumGrade(10, 20, 30);
		System.out.println(sum);
		avg = totalAvg(10, 20, 30);
		System.out.println(avg);

		switch (avg / 10) {
		case 9:
			System.out.println("A학점 입니다");
			break;
		case 8:
			System.out.println("B학점 입니다");
			break;
		case 7:
			System.out.println("C학점 입니다");
			break;
		default:
			System.out.println("F학점 입니다");
			break;
		}
//
//		if(avg>90) {
//			grade = 'A';
//		}else if(avg>80){
//			grade = 'B';
//		}else {
//			grade = 'C';
//		}

//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
//		System.out.printf("평균 : %.2f" ,avg);


	}
}
