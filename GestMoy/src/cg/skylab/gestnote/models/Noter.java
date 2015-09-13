package cg.skylab.gestnote.models;

import java.io.Serializable;
import java.util.Date;

public class Noter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Double noteObtenue;
	private Date dateObtention;
	private Etudiant etudiant;
	private Matiere matiere;
	private TypeEval typeEval;
	
	
	public Noter() {
		super();
		
	}


	public Noter(Double noteObtenue, Date dateObtention, Etudiant etudiant,
			Matiere matiere, TypeEval typeEval) {
		super();
		this.noteObtenue = noteObtenue;
		this.dateObtention = dateObtention;
		this.etudiant = etudiant;
		this.matiere = matiere;
		this.typeEval = typeEval;
	}


	public Double getNoteObtenue() {
		return noteObtenue;
	}


	public void setNoteObtenue(Double noteObtenue) {
		this.noteObtenue = noteObtenue;
	}


	public Date getDateObtention() {
		return dateObtention;
	}


	public void setDateObtention(Date dateObtention) {
		this.dateObtention = dateObtention;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Matiere getMatiere() {
		return matiere;
	}


	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}


	public TypeEval getTypeEval() {
		return typeEval;
	}


	public void setTypeEval(TypeEval typeEval) {
		this.typeEval = typeEval;
	}
	
	
	

}
