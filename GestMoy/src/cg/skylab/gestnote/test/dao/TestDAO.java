package cg.skylab.gestnote.test.dao;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.dao.DAOFactory;
import cg.skylab.gestnote.models.Etudiant;
import cg.skylab.gestnote.models.Filiere;

public class TestDAO {

	public static void main(String[] args) {
		
		DAO<Etudiant> etudiantDao = DAOFactory.getEtudiantDAO();
		DAO<Filiere> optionDao = DAOFactory.getOptionDAO();
		
		Filiere filiere=optionDao.find("EMI");
				
		
		Etudiant etudiant = new Etudiant();
		etudiant.setNomEtudiant("NIEME");
		etudiant.setPrenomEtudiant("Dieudonné");
		etudiant.setCodeOption(filiere);
		
		
		etudiantDao.create(etudiant);
		
		
		

	}

}
