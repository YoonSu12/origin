package UserGD.model;

public class UserGD {
	
	private String userid;
	private String userpw;
	private String username;
	private String usertel;
	private String useremail;
	
	public UserGD(){}
	
	public UserGD(String userid, String userpw, String username, String usertel, String useremail) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.usertel = usertel;
		this.useremail = useremail;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsertel() {
		return usertel;
	}
	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	@Override
	public String toString() {
		return "UserGD [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", usertel=" + usertel
				+ ", useremail=" + useremail + "]";
	}
	
}
