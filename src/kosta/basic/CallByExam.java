package kosta.basic;

public class CallByExam {

	public static int change(int num) {
		num=num+100;
		return num;	
	}
	
	public static void change2(int[] arr) {
		arr[0]=arr[0]+10;
	}
	
	public static void main(String[] args) {
		// call by value and call by reference
		int num=100;
		int arr[]= {10};
		
		num=change(num);
		change2(arr);
		System.out.println("num= " + num);
		System.out.println("arr[0]= " + arr[0] );
	}

}
