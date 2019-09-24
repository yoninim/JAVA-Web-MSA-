package kosta.video;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video rentalVideo;
	
	public GeneralMember() {}

	public GeneralMember(String id, String name, String address, Video rentalVideo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.rentalVideo = rentalVideo;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public Video getrentalVideo() {
		return rentalVideo;
	}

	public void setrentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

	public void show() {
		System.out.println("회원의 아이디 : "+id);
		System.out.println("회원의 이름 : "+name);
		System.out.println("회원의 주소 : "+address);
		System.out.println("회원이 대여한 비디오 : "+rentalVideo.getVideoNo());
		System.out.println("회원이 대여한 비디오 제목 :"+rentalVideo.getVideoName());
		System.out.println("회원이 대여한 비디오 주인공 : "+rentalVideo.getAct());
	}
}
