package kosta.basic;

public class methodExam {
//	 메소드 정의
//	 접근제어자(public) 리턴형 메소드 이름(파라미터들){
//	 메소드 내용
//	 return 변수; > 선택
//   }
	
	public static void main(String[] args) {
		printCharacter('#', 30);
		System.out.println("Hello JAVA");
		printCharacter('@', 30);
		
		
		int re = getAdd(100, 200);
		System.out.println(re);
	}
	
	public static void printCharacter(char ch, int n) {
		for(int i=1;i<n;i++) {
			System.out.print(ch);
		}
		System.out.println("");
	}
	
	public static int getAdd(int a, int b) {
		int sum = a+b;
		
		return sum;
	}

}
