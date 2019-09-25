package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class UserListAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	private ArrayList<UserInfoDTO> userInfoDTOList = new ArrayList<UserInfoDTO>();

	public String execute() throws SQLException{
		UserListDAO userListDAO = new UserListDAO();
		userInfoDTOList = userListDAO.getUserInfo();
		if(!(userInfoDTOList.size() > 0)){
			userInfoDTOList = null;
		}
		String result = SUCCESS;
		return result;
	}

	public ArrayList<UserInfoDTO> getUserInfoDTOList(){
		return this.userInfoDTOList;
	}
	public void setUserInfoDTOList(ArrayList<UserInfoDTO> userInfoDTOList){
		this.userInfoDTOList = userInfoDTOList;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}

}
