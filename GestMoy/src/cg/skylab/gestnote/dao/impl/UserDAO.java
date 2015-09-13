package cg.skylab.gestnote.dao.impl;

import java.sql.Connection;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.User;

public class UserDAO extends DAO<User>{

	public UserDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public User find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
