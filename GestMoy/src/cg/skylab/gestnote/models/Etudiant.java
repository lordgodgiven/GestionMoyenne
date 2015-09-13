package cg.skylab.gestnote.models;

import java.io.Serializable;
import java.util.List;

public class Etudiant implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idEtudiant;
	private String nomEtudiant;
	private String prenomEtudiant;
	private String sexeEtudiant;
	private String adresseEtudiant;
	private List<Noter> noterList;
	private Option codeOption;
	private List<Moyenne> moyenneList;
	
	public Etudiant() {
		super();
		
	}

	public Etudiant(String nomEtudiant, String prenomEtudiant,
			String sexeEtudiant, String adresseEtudiant) {
		super();
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.sexeEtudiant = sexeEtudiant;
		this.adresseEtudiant = adresseEtudiant;
	}

	public Integer getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(Integer idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNomEtudiant() {
		return nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}

	public String getSexeEtudiant() {
		return sexeEtudiant;
	}

	public void setSexeEtudiant(String sexeEtudiant) {
		this.sexeEtudiant = sexeEtudiant;
	}

	public String getAdresseEtudiant() {
		return adresseEtudiant;
	}

	public void setAdresseEtudiant(String adresseEtudiant) {
		this.adresseEtudiant = adresseEtudiant;
	}

	public List<Noter> getNoterList() {
		return noterList;
	}

	public void setNoterList(List<Noter> noterList) {
		this.noterList = noterList;
	}

	public Option getCodeOption() {
		return codeOption;
	}

	public void setCodeOption(Option codeOption) {
		this.codeOption = codeOption;
	}

	public List<Moyenne> getMoyenneList() {
		return moyenneList;
	}

	public void setMoyenneList(List<Moyenne> moyenneList) {
		this.moyenneList = moyenneList;
	}
	
	
	
	
	
}
