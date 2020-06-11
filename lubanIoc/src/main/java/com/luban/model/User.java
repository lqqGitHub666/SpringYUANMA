package com.luban.model;

/**
 * @author 作者 lqq
 * @ClassName 类名 User
 * @date 2019/10/24 11:44
 * @注释：
 */
public class User {

	private String userName;

	private String height;

	public User() {
	}

	public User(String userName, String height) {
		this.userName = userName;
		this.height = height;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
