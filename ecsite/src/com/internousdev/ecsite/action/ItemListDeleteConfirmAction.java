package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteConfirmAction extends ActionSupport{

	public Map<String,Object> session;
	private ArrayList<ItemInfoDTO> itemInfoDTOList = new ArrayList<ItemInfoDTO>();

	public String execute() throws SQLException{

		ItemListDAO itemListDAO = new ItemListDAO();
		itemInfoDTOList = itemListDAO.getItemInfo();
		if(!(itemInfoDTOList.size() > 0)){
			itemInfoDTOList = null;
		}
		 String result = SUCCESS;
		return result;
	}
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}

	public ArrayList<ItemInfoDTO> getItemInfoDTOList(){
		return this.itemInfoDTOList;
	}
	public void setItemInfoDTOList(ArrayList<ItemInfoDTO> itemInfoDTOList){
		this.itemInfoDTOList = itemInfoDTOList;
	}
}
