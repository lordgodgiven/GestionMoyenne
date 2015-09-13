package cg.skylab.gestnote.dao.impl;

import java.sql.Connection;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.Etudiant;

public class EtudiantDAO extends DAO<Etudiant> {

	public EtudiantDAO(Connection conn) {
		super(conn);

	}

	@Override
	public boolean create(Etudiant obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Etudiant obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Etudiant obj) {
		// TODO Auto-generated method stub
		return false;
	}


	public Etudiant find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
