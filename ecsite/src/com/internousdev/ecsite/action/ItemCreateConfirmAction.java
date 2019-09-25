package com.internousdev.ecsite.action;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String,Object> session;
	private String errorMessage;


	public String execute(){
		String result = SUCCESS;



		String regex ="-?([1-9]\\d{0,2}(,\\d{3})*|[1-9]\\d{0,})";
		Pattern p = Pattern.compile(regex);



		String seat1 = "001";
		Matcher miP = p.matcher(seat1);
		Matcher miS = p.matcher(itemStock);




		if(!(itemName.equals(""))
				&& !(itemPrice.equals(""))
				&& !(itemStock.equals(""))){

			if(miP.find() && miS.find()){

			seat1 = Integer.valueOf(itemPrice).toString();
			session.put("itemName", itemName);
			session.put("itemPrice",seat1);
			session.put("itemStock", itemStock);

			result =SUCCESS;

			}else{
					setErrorMessage("価格　在庫には数字を入力してください");
					result = ERROR;
				}

		}else{
			setErrorMessage("未入力の項目があります");
			result = ERROR;
		}
		return result;

		}

	public String getItemName(){
		return this.itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public String getItemStock(){
		return this.itemStock;
	}
	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}

	public Map<String,Object> getSession(){
		return this.session;
	}
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public String getErrorMessage(){
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

}
