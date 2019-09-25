package com.internousdev.ecsite.dto;

public class UserInfoDTO {

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String insert_date;

	public String getLoginUserId(){
		return this.loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return this.loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getInsert_date(){
		return this.insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}

}
