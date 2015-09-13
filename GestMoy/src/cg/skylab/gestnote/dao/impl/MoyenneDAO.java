package cg.skylab.gestnote.dao.impl;

import java.sql.Connection;
import java.util.List;

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

	@Override
	public Moyenne find(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Moyenne> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
