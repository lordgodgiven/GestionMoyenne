package cg.skylab.gestnote.models;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private short enabled;
	private String nom;
	private String prenom;
	private String sexe;
	private List<UserRole> userRolesList;
	
	public User() {
		super();
		
	}

	public User(String username, String password, short enabled, String nom,
			String prenom, String sexe) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getEnabled() {
		return enabled;
	}

	public void setEnabled(short enabled) {
		this.enabled = enabled;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public List<UserRole> getUserRolesList() {
		return userRolesList;
	}

	public void setUserRolesList(List<UserRole> userRolesList) {
		this.userRolesList = userRolesList;
	}
	
	
	

}
