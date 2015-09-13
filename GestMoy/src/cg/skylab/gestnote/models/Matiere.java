package cg.skylab.gestnote.models;

import java.io.Serializable;
import java.util.List;

public class Matiere implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codeMatiere;
	private String libelleMatiere;
	private List<Filiere> optionList;
	private List<Noter> noterList;
	
	public Matiere() {
		super();
		
	}

	public Matiere(String codeMatiere, String libelleMatiere) {
		super();
		this.codeMatiere = codeMatiere;
		this.libelleMatiere = libelleMatiere;
	}

	public String getCodeMatiere() {
		return codeMatiere;
	}

	public void setCodeMatiere(String codeMatiere) {
		this.codeMatiere = codeMatiere;
	}

	public String getLibelleMatiere() {
		return libelleMatiere;
	}

	public void setLibelleMatiere(String libelleMatiere) {
		this.libelleMatiere = libelleMatiere;
	}

	public List<Filiere> getOptionList() {
		return optionList;
	}

	public void setOptionList(List<Filiere> optionList) {
		this.optionList = optionList;
	}

	public List<Noter> getNoterList() {
		return noterList;
	}

	public void setNoterList(List<Noter> noterList) {
		this.noterList = noterList;
	}
	
	

	
}
