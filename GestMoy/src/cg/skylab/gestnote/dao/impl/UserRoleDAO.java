package cg.skylab.gestnote.dao.impl;

import java.sql.Connection;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.UserRole;

public class UserRoleDAO extends DAO<UserRole>{

	public UserRoleDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(UserRole obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(UserRole obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserRole obj) {
		// TODO Auto-generated method stub
		return false;
	}


	public UserRole find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}