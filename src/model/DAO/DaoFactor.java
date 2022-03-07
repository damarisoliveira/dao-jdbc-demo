package model.DAO;

import model.DAO.impl.SellerDaoJDBC;

public class DaoFactor {

	
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC();
	}
}
