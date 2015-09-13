package cg.skylab.gestnote.models;

import java.io.Serializable;

public class Moyenne implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idMoyenne;
	private Double moyenneObtenue;
	private String observation;
	private Etudiant idEtudiant;
	private TypeMoyenne codeTypeMoyenne;
	
	
	public Moyenne() {
		super();
		
	}


	public Moyenne(Double moyenneObtenue, String observation) {
		super();
		this.moyenneObtenue = moyenneObtenue;
		this.observation = observation;
	}


	public Integer getIdMoyenne() {
		return idMoyenne;
	}


	public void setIdMoyenne(Integer idMoyenne) {
		this.idMoyenne = idMoyenne;
	}


	public Double getMoyenneObtenue() {
		return moyenneObtenue;
	}


	public void setMoyenneObtenue(Double moyenneObtenue) {
		this.moyenneObtenue = moyenneObtenue;
	}


	public String getObservation() {
		return observation;
	}


	public void setObservation(String observation) {
		this.observation = observation;
	}


	public Etudiant getIdEtudiant() {
		return idEtudiant;
	}


	public void setIdEtudiant(Etudiant idEtudiant) {
		this.idEtudiant = idEtudiant;
	}


	public TypeMoyenne getCodeTypeMoyenne() {
		return codeTypeMoyenne;
	}


	public void setCodeTypeMoyenne(TypeMoyenne codeTypeMoyenne) {
		this.codeTypeMoyenne = codeTypeMoyenne;
	}
	
	

}
