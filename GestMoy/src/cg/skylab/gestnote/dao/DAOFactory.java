package cg.skylab.gestnote.dao;

import java.sql.Connection;

import cg.skylab.gestnote.dao.impl.EtudiantDAO;
import cg.skylab.gestnote.dao.impl.MatiereDAO;
import cg.skylab.gestnote.dao.impl.MoyenneDAO;
import cg.skylab.gestnote.dao.impl.NoterDAO;
import cg.skylab.gestnote.dao.impl.OptionDAO;
import cg.skylab.gestnote.dao.impl.TypeEvalDAO;
import cg.skylab.gestnote.dao.impl.UserDAO;
import cg.skylab.gestnote.dao.impl.UserRoleDAO;
import cg.skylab.gestnote.utils.DBUtil;

public class DAOFactory {

	/**
	 * Retourne un objet connexion
	 */
	protected static final Connection conn = DBUtil.getConnection();


	/**
	 * Retourne un objet Etudiant 
	 * @return DAO
	 */
	public static DAO getEtudiantDAO() {
		return new EtudiantDAO(conn);
	}


	/**
	 * Retourne un objet Option
	 * @return
	 */
	public static DAO getOptionDAO() {
		return new OptionDAO(conn);

	}
	
	/**
	 * Retourne un objet Matiere
	 * @return
	 */
	public static DAO getMatiereDAO(){
		return new MatiereDAO(conn);
	}
	
	/**
	 * Retourne un objet Noter
	 * @return
	 */
	public static DAO getNoterDAO(){
		return new NoterDAO(conn);
	}
	
	/**
	 * Retourne un objet Noter
	 * @return
	 */
	public static DAO getUserDAO(){
		return new UserDAO(conn);
		
	}
	
	/**
	 * Retourne un objet UserRole
	 * @return
	 */
	public static DAO getUserRole(){
		return new UserRoleDAO(conn);
	}
	
	/**
	 * Retourne un objet Moyenne
	 * @return
	 */
	public static DAO  getMoyenne(){
		return new MoyenneDAO(conn);
	}
	
	/**
	 * Retourne un objet TypeEval
	 * @return
	 */
	public static DAO  getTypeEval(){
		return new TypeEvalDAO(conn);
	}
}
