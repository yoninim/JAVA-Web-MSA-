package kosta.oop;

import java.util.Scanner;

public class CosmeticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		Cosmetic c[] = {
				new Cosmetic("헤라", 29000, 8),
				new Cosmetic("랑콤", 37000, 5),
				new Cosmetic("샤넬", 10000, 2)
		};
		
		System.out.println("구매수량을 입력하세요");
		int num = sc.nextInt();
		
		for(int i = 0 ; i<c.length;i++) {
			c[i].shipment(num);
			c[i].print();
			c[i].release(num);
			
		}

	}

}
