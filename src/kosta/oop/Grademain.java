package kosta.oop;

public class Grademain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade[] arr = {
				new Grade("홍길동",90,80,79),
				new Grade("박길동",20,30,49),
				new Grade("김길동",50,60,79),
		};
		for(int i=0;i<arr.length;i++) {
		arr[i].print();
		}
	}

}
