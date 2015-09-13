package cg.skylab.gestnote.dao;

import java.sql.Connection;

public abstract class DAO<T> {

	protected Connection connect = null;

	public DAO(Connection conn) {
		this.connect = conn;
	}


	/**
	 * Methode de création
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean create(T obj);


	/**
	 * Methode de suppression
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean delete(T obj);


	/**
	 * Methode de mise à jour
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean update(T obj);


}
