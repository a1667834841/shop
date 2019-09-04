package com.qingliang.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回的类
 * 
 * @author
 * 
 */
public class Msg {
	/*100 代表成功  200代表失败*/
	private int code;
	/*提示信息*/
	private String msg;
	/*用户返回浏览器的数据*/
	private Map<String,Object> map = new HashMap<String,Object>();

	public static Msg success(){
		Msg result = new Msg();
		result.setCode(100);
		result.setMsg("处理成功");
		return result;
	}

	public static Msg fail(){
		Msg result = new Msg();
		result.setCode(200);
		result.setMsg("处理失败");
		return result;
	}

	public Msg add(String key,Object obj){
		this.getMap().put(key,obj);
		return this;
	}



	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
}
