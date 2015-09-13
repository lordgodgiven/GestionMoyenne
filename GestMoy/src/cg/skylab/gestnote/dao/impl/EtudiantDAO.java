package cg.skylab.gestnote.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.models.Etudiant;

public class EtudiantDAO extends DAO<Etudiant> {

	public EtudiantDAO(Connection conn) {
		super(conn);

	}

	@Override
	public boolean create(Etudiant obj) {
		boolean ret = false;
		String sql = "INSERT INTO etudiant (code_option, nom_etudiant, prenom_etudiant) VALUES (?,?,?)" ;

		try {

			PreparedStatement pst = this.connect.prepareStatement(sql);
			pst.setString(1, obj.getCodeOption().getCodeOption());
			pst.setString(2, obj.getNomEtudiant());
			pst.setString(3, obj.getPrenomEtudiant());
			pst.executeUpdate();
			ret = true;
		} catch (SQLException e) {
			ret = false;
			e.printStackTrace();
		}
		return ret;
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

	@Override
	public Etudiant find(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiant> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
