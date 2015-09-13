package cg.skylab.gestnote.test.dao;

import cg.skylab.gestnote.dao.DAO;
import cg.skylab.gestnote.dao.DAOFactory;
import cg.skylab.gestnote.models.Option;

public class TestDAO {

	public static void main(String[] args) {
		
		DAO<Option> optionDao = DAOFactory.getOptionDAO();
		
		Option option = new Option();
		option.setCodeOption("EMI");
		option.setLibelleOption("Electronique et Maintenance Informatique");
		
		boolean ret = optionDao.create(option);
		
		if(ret){
			System.out.println("OK");
		}else{
			System.out.println("KO");
		}

	}

}
