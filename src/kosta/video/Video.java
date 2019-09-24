package kosta.video;

public class Video {
	private int videoNo;
	private String videoName;
	private String act;
	
	public Video() {}
	
	public Video(int videoNo, String videoName, String act) {
		super();
		this.videoNo = videoNo;
		this.videoName = videoName;
		this.act = act;
	}
	
	public int getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	
}
