package kosta.basic;

public class ArrayExam {

	public static void main(String[] args) {
		// 1. 배열 선언, 생성 분리
		int arr[];// 주소값을 넣을 수 있는 변수가 생성
		arr = new int[5]; //int형 변수 5개 생성, arr변수에 생성된 배열의 주소값이 대입된다
		
		// 2. 배열 선언과 생성을 함께
		int arr2[]=new int[5];
		
		// 3. 배열 선언, 생성, 초기화
		int arr3[]= {1,2,3,4,5};
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println("arr3["+i+"]"+arr3[i]);
		}
		
		//향상된 for문. 인덱스값이 나오지 않는다는 단점이 있음
		for(int n : arr3) {
			System.out.print(n+" , ");
		}
		
		//1. 배열에 사용될 데이터 타입은 무엇인가?
		//2. 배열의 크기는 얼마인가?
		//3. 배열을 어떻게 초기화 할 것인가(직접인덱스 접근, for문, 생성과 동시에)
		// > 배열 크기를 초과 했을 때 > ArrayIndexOfBoundsException
		// 4. 배열 안에 데이터를 어떻게 출력할것인지?(for문, 향상된for문)'
		
		//퀴즈?구구단 7단의 결과를 배열 안에 초기화 후 배열에 있는 데이터를 출력하자.
		
		
		int arr4[] = new int[9];
		for(int i=0;i<arr4.length;i++) {
			arr4[i] = 7*(i+1);
			System.out.println("7 X "+(i+1)+"="+arr4[i]);
		}
		
		
		
	}

}
