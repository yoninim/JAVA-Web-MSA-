package kosta.oop;

public class Grade {
	String name;
	int kor, math, eng;
	int tot, avg;

	public Grade() {}

	public Grade(String name, int kor, int math, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
		getTotal();
		getAver();
	}
	
	public void getTotal() {
		tot =kor+math+eng;
	}
	public void getAver() {
		avg=tot/3;
	}
	public void print() {
		System.out.println(name+"\t"+ kor +"\t" + math + "\t"+ eng +"\t"+ tot +"\t"+ avg);
	}
}
