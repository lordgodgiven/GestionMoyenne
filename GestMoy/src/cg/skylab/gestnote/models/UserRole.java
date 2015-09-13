package cg.skylab.gestnote.models;

import java.io.Serializable;

public class UserRole implements Serializable{

private static final long serialVersionUID = 1L;
	
	private Integer userRoleId;
	private String role;
	private User username;
	
	
	public UserRole() {
		super();
		
	}


	public UserRole(Integer userRoleId, String role) {
		super();
		this.userRoleId = userRoleId;
		this.role = role;
	}


	public Integer getUserRoleId() {
		return userRoleId;
	}


	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public User getUsername() {
		return username;
	}


	public void setUsername(User username) {
		this.username = username;
	}
	
	

}
