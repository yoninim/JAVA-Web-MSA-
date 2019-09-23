package kosta.oop;

public class Bookmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book arr[]= {
				new Book("자바", 30000),
				new Book("JSP", 25000),
				new Book("Oracle", 15000),
		};
		
		for(int i=0;i<arr.length;i++) {
			arr[i].discount();
			arr[i].print();
			}
		
	}

}
