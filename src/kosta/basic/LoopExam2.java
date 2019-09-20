package kosta.basic;

import java.util.Scanner;

public class LoopExam2 {

	public static void main(String[] args) {
		// 중첩 for문
		
/*		for(int i=1;i<=3;i++) {
			for(int j=1;j<=2;j++) {
			System.out.println("i=" + i + ",j=" + j);
			}
		}*/
		
		//구구단 2~9단 출력
/*		for(int i=2;i<=9;i++) {
			System.out.println("##"+i+"단");
			for(int j=1;j<=9;j++) {
			System.out.println(i+"X"+j+"="+(i*j));
			}
			System.out.println();
		}*/
		
		//4x+5y=60
/*		for(int x=0;x<=15;x++) {
			for(int y=0;y<=15;y++) {
				if((4*x+5*y)==60) {
					System.out.println("x는 "+x+" y는 "+y);
				}
			}
		}*/
		
		//*
		//**
		//***
		//****
		//*****
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요");
		int num = sc.nextInt();
		char ch='*';
		
		for(int i=8;i>=0;i--) {
			for(int j=0;j<=num;j++) {
				for(int k=1;k<j;k++) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
			}
		
		
		
		
		
		
	}

}
