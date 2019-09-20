package kosta.basic;

public class ArrayExam2 {

	public static void main(String[] args) {
		int arr[][]; //2차원 배열 선언
		arr = new int[3][2]; //2차원 배열 생성
		
		//2차원 배열의 크기를 상이하게 생성
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		
		//3. 2차원 배열 선언,생성,초기화
		int arr3[][]= {{1,2},{3,4},{5,6}};
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.println("arr3["+i+"]["+j+"]"+arr3[i][j]);
			}
		}
		
		String oldArr[]= new String[3];
		oldArr[0]="10";
		oldArr[1]="20";
		
		String newArr[]= new String[2];
		System.arraycopy(oldArr,0, newArr, 0, newArr.length);
		
		for(int i=0;i<newArr.length;i++) {
			if(Integer.parseInt(newArr[i])==20) {
				System.out.println("20");
			}
		}
		
	}

}
