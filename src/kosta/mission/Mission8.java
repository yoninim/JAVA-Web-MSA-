package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission8 {

	public static void main(String[] args) {
		// up/down Game
		// 1~100 임의의 정수를 맞추는 게임
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int re = r.nextInt(100);
		System.out.println(re);
		int rr,cnt=0;
		

		while(true) {
			System.out.print("값을 입력하세요 ");
			rr = sc.nextInt();
			cnt++;
			
			if(re > rr) {
				System.out.println("up");
			}else if(re < rr){
				System.out.println("down");
			}else {
				break;
			}
		}
		System.out.println(cnt+"회 만에 정답을 맞추셨습니다");
	}
}
