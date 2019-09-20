package kosta.oop;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member oa ,ob,oc; 
		oa = new Member("이소연", 29, "서울");
		ob = new Member("기소연", 27, "경기");
		oc = new Member("박소연", 24, "부산");
		
		System.out.println(oa.name);
		System.out.println(oa.age);
		System.out.println(oa.addess);
		
		
	}

}
