package kosta.basic;

import java.util.Scanner;

public class LoopExam {

	public static void main(String[] args) {
		// while : 초기식 > 조건식 > 명령문 > 증감식 : 수직방향
		
//		int i=1;
//		int sum=0;
//		while(i<=10) {
//			sum += i;
//		}
//		System.out.println("1에서 10까지의 합은" + sum);
		
		
//		int j=1,multi=0;
//		while(j<=9) {
//			multi= 7*j;
//			System.out.println("7 X" + j + "=" + multi);
//			j++;
//		}
//			
//		int cnt=0;
//		do {
//			System.out.println(cnt);
//			cnt++;
//		}while(cnt<10);
		
		
		//미션 > 키보드로 부터 정수를 입력 받는 프로그램을 만들자
		//조건 > 음수를 입력하면 다시 입력을 받도록하여 양수만 출력되도록 하자.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		do {
//			System.out.print("정수입력 : ");
//			num=sc.nextInt();
//		}while(num<=0);
//		
//		System.out.println(num);
		
		
		//do~while 이용하여 정수 2자리 숫자만 입력받아 출력하세요
		
//		Scanner sc = new Scanner(System.in);
//		
//		int x;
//		do {
//			System.out.print("값 입력 : ");
//			x=sc.nextInt();
//		}while(x<10 || x>99);
//			System.out.println(x);
		
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1부터 10까지의 합은" +sum);
		
		
		int gu=0,i;
		for(i=1;i<10;i++) {
			gu=7*i;
			System.out.println("7X" + i + "="+gu);
		}
		
	}
}
