package cg.skylab.gestnote.models;

import java.io.Serializable;
import java.util.List;

public class TypeEval implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codeTypeEval;
	private String libelleTypeEval;
	private List<Noter> noterList;
	
	
	public TypeEval() {
		super();
		
	}


	public TypeEval(String codeTypeEval, String libelleTypeEval) {
		super();
		this.codeTypeEval = codeTypeEval;
		this.libelleTypeEval = libelleTypeEval;
	}


	public String getCodeTypeEval() {
		return codeTypeEval;
	}


	public void setCodeTypeEval(String codeTypeEval) {
		this.codeTypeEval = codeTypeEval;
	}


	public String getLibelleTypeEval() {
		return libelleTypeEval;
	}


	public void setLibelleTypeEval(String libelleTypeEval) {
		this.libelleTypeEval = libelleTypeEval;
	}


	public List<Noter> getNoterList() {
		return noterList;
	}


	public void setNoterList(List<Noter> noterList) {
		this.noterList = noterList;
	}
	
	

}
