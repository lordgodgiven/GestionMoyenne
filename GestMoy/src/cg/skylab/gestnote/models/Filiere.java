package cg.skylab.gestnote.models;

import java.io.Serializable;
import java.util.List;

public class Filiere implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codeOption;
	private String libelleOption;
	private List<Matiere> matierList;
	private List<Etudiant> etudiantList;
	
	
	public Filiere() {
		super();
		
	}


	public Filiere(String codeOption, String libelleOption) {
		super();
		this.codeOption = codeOption;
		this.libelleOption = libelleOption;
	}


	public String getCodeOption() {
		return codeOption;
	}


	public void setCodeOption(String codeOption) {
		this.codeOption = codeOption;
	}


	public String getLibelleOption() {
		return libelleOption;
	}


	public void setLibelleOption(String libelleOption) {
		this.libelleOption = libelleOption;
	}


	public List<Matiere> getMatierList() {
		return matierList;
	}


	public void setMatierList(List<Matiere> matierList) {
		this.matierList = matierList;
	}


	public List<Etudiant> getEtudiantList() {
		return etudiantList;
	}


	public void setEtudiantList(List<Etudiant> etudiantList) {
		this.etudiantList = etudiantList;
	}
	
	

}
