package cg.skylab.gestnote.dao.impl;

import java.sql.Connection;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.Noter;

public class NoterDAO extends DAO<Noter>{

	public NoterDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Noter obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Noter obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Noter obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Noter find(Integer idEtudiant, String codeMatier, String codeTypeEval) {
		// TODO Auto-generated method stub
		return null;
	}

}
