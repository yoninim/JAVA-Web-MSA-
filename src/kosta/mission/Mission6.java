package kosta.mission;

public class Mission6 {

	// swap 구현 메소드
	public static void swap(int[] arr) {
		int tmp;
		tmp = arr[0];
		arr[0] = arr[4];
		arr[4] = tmp;

	}

	// reverse 구현 메소드
	public static void reverse(int arr[]) {
		for (int i = 0; i < arr.length / 2; i++) {
			swap2(arr, i, arr.length - i - 1);
//			tmp = arr[i];
//			arr[i] = arr[4-i];
//			arr[4-i] = tmp;
		}
	}

	// 배열의 내용 비교 메소드
	public static boolean equals(int a[], int b[]) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int n=0;n<a.length;n++) {
			if(a[n] != b[n]) {
				return false;
			}
		}
		
		return true;

	}

// 강사님 코드
	public static void swap2(int arr[], int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		// swap > 1<=>5 의 위치를 변경
		// reverse 구현

		swap2(arr, 0, 4);
		for (int n : arr) {
			System.out.print(n + ",");
		}

		System.out.println();

//		reverse(arr);
//		for (int n : arr) {
//			System.out.print(n + ",");
//		}

		System.out.println();

		if (equals(arr, arr2)) {
			System.out.println("배열의 내용 같음");
		} else {
			System.out.println("배열의 내용 다름");
		}

	}

}
