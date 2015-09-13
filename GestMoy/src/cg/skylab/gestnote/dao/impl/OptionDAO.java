package cg.skylab.gestnote.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.Filiere;



public class OptionDAO extends DAO<Filiere> {

	public OptionDAO(Connection conn) {
		super(conn);
		
	}

	@Override
	public boolean create(Filiere obj) {
		boolean ret = false;
		String sql = "INSERT INTO filiere (code_option, libelle_option) VALUES (?,?)" ;

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
	public boolean delete(Filiere obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Filiere obj) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public Filiere find(Object id) {
		Filiere option=null;
		ResultSet rs =null;
		
		String sql = "SELECT code_option, libelle_option FROM filiere WHERE code_option = ?" ;

		try {

			PreparedStatement pst = this.connect.prepareStatement(sql);
			pst.setString(1, (String) id);
			rs = pst.executeQuery();
			if(rs.next())
				option = new Filiere();
			option.setCodeOption(rs.getString("code_option"));
			option.setLibelleOption(rs.getString("libelle_option"));
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return option;
	}

	@Override
	public List<Filiere> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
