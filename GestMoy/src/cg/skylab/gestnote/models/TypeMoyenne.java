package cg.skylab.gestnote.models;

import java.io.Serializable;
import java.util.List;

public class TypeMoyenne implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codeTypeMoyenne;
	private String libelleTypeMoyenne;
	private List<Moyenne> moyenneList;
	
	public TypeMoyenne() {
		super();
		
	}

	public TypeMoyenne(String codeTypeMoyenne, String libelleTypeMoyenne) {
		super();
		this.codeTypeMoyenne = codeTypeMoyenne;
		this.libelleTypeMoyenne = libelleTypeMoyenne;
	}

	public String getCodeTypeMoyenne() {
		return codeTypeMoyenne;
	}

	public void setCodeTypeMoyenne(String codeTypeMoyenne) {
		this.codeTypeMoyenne = codeTypeMoyenne;
	}

	public String getLibelleTypeMoyenne() {
		return libelleTypeMoyenne;
	}

	public void setLibelleTypeMoyenne(String libelleTypeMoyenne) {
		this.libelleTypeMoyenne = libelleTypeMoyenne;
	}

	public List<Moyenne> getMoyenneList() {
		return moyenneList;
	}

	public void setMoyenneList(List<Moyenne> moyenneList) {
		this.moyenneList = moyenneList;
	}
	
	
	

}
