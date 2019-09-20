package kosta.mission;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		//정수 b에서 정수 a를 뺀 값을 구하자.
		//b > a가 되도록 입력 받음.
		
		//1. do~while 
		//2.while(true) break;
		
		Scanner sc =new Scanner(System.in);
		
		int a,b,num=0;
		do {
			System.out.print("a :");
			a=sc.nextInt();
			System.out.print("b :");
			b=sc.nextInt();
		}while(b<=a);
		num=b-a;
			System.out.println("B - A = "+num);
		
			
		int c,d,num2=0;
		while(true) {
			System.out.print("c :");
			c=sc.nextInt();
			System.out.print("d :");
			d=sc.nextInt();
			if(d>c) {
				num2=d-c;
				System.out.println("결과는"+num2);
				break;
			}
		}
	}

}
