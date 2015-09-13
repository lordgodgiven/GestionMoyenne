package cg.skylab.gestnote.dao.impl;

import java.sql.Connection;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.Matiere;

public class MatiereDAO extends DAO<Matiere>{

	public MatiereDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Matiere obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Matiere obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Matiere obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Matiere find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
