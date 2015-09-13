package cg.skylab.gestnote.dao.impl;

import java.sql.Connection;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.Moyenne;

public class MoyenneDAO extends DAO<Moyenne>{

	public MoyenneDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Moyenne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Moyenne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Moyenne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Moyenne find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
