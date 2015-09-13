package cg.skylab.gestnote.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.Option;



public class OptionDAO extends DAO<Option> {

	public OptionDAO(Connection conn) {
		super(conn);
		
	}

	@Override
	public boolean create(Option obj) {
		boolean ret = false;
		String sql = "INSERT INTO option (code_option, libelle_option) VALUES (?, ?)" ;

		try {

			PreparedStatement pst = this.connect.prepareStatement(sql);
			pst.setString(1, obj.getCodeOption());
			pst.setString(2, obj.getLibelleOption());
			pst.executeUpdate();
			ret = true;
		} catch (SQLException e) {
			ret = false;
			e.printStackTrace();
		}
		return ret;
	}

	@Override
	public boolean delete(Option obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Option obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Option find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
