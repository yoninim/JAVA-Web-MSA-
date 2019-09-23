package kosta.mission;

public class Mission2 {

	public static void main(String[] args) {
		// 특정 정수값에 대해서 전체 자리수 중 짝수, 홀수 갯수를 구하자.
		// 5자리 정수
		int num = 12345;
		int even = 0;
		int odd = 0;

		even += (num / 10000 % 2 == 0) ? 1 : 0;
		even += (num / 1000 % 20 % 2 == 0) ? 1 : 0;
		even += (num / 100 % 20 % 2 == 0) ? 1 : 0;
		even += (num / 10 % 20 % 2 == 0) ? 1 : 0;
		even += (num % 2 == 0) ? 1 : 0;

		odd = 5 - even;

//		even = (num%10000==0)?1:(num%2000==0)?2:(num%300==0)?3:((num%40==0)?4:5);
//		odd =(num%10000==1)?1:(num%2000==1)?2:(num%300==1)?3:((num%40==1)?4:5);

		System.out.println("짝수의 갯수:" + even);
		System.out.println("홀수의 갯수:" + odd);
		
		

	}

}
