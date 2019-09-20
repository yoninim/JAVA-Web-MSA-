package kosta.basic;

public class valuableexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 66;
		System.out.println((char) num1);

		float num2 = 3.14f;

		char ch = 'A';
		System.out.println((int) ch);

		String str = "ABC";
		boolean bool = false;

		// 형변환 (Casting) : 기본형 데이터타입
		// byte < short < int < long < float < double

		int num3 = 10;
		double dnum = num3; // => double : 묵시적 형변환
		double e = 3;
		int num4 = (int) 3.14;// 강제 형변환
		System.out.println(num4);

		int num5 = 100 % 3;
		System.out.println(num5);

		num5 += 2;
		System.out.println(num5);

		int x = 10;
		int y = 0;

		y = x++;
		System.out.println("x :" + x);
		System.out.println("y :" + y);

		System.out.println("나는 \"비틀즈가 좋아\"라고 말했다");
		String btz = "나는" + "비틀즈가" + "좋아";
		System.out.println(btz);

		String str2 = "70" + 10 + "20";
		System.out.println(str2);

		int num6 = Integer.parseInt(str2); // 문자열을 정수형으로 형변환 , NumberFormatException 오류 발생 시 의심 필요
		int re = num6 + 10;
		System.out.println(re);

		int a = 3, b = 10;
		if (a == 2 | b == 10) {
			System.out.println("맞습니다");
		} else {
			System.out.println("다릅니다");
		}

		int score = 89;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(grade);

		int student = 3;
		char room = (student > 1) ? 'A' : 'B';
		System.out.println(room);

		// 문자열 : String 클래스
		// 문자열 비교 == > equals() 사용

		String str3 = "abc";
		String str4 = new String("abc");

		if (str3.equals(str4))
			System.out.println("같음");
		else
			System.out.println("다름");

		int big;
		for(big=0;big<10;big++) {
			System.out.println(big);
			if (big==5)
				break;

		}
	}

}
