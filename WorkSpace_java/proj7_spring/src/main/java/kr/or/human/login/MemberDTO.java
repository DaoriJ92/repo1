package kr.or.human.login;

public class MemberDTO {
	
	private String userID;
	private String userPW;
	private String userName;
	public String getUserID() {
		System.out.println("getUserID ����");
		return userID;
	}
	public void setUserID(String userID) {
		System.out.println("setUserID ����");
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [userID=" + userID + ", userPW=" + userPW + ", userName=" + userName + "]";
	}

}
