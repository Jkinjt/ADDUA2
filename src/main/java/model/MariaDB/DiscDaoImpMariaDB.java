package model.MariaDB;

import java.util.List;

import model.Disc;
import model.DAO.DiscDAO;

public class DiscDaoImpMariaDB extends Disc implements DiscDAO{
	//Consultas a la base de datos
		private static final String INSERT="";
		private static final String UPDATE="";
		private static final String DELETE="";
		private static final String SELECTALL="";
		private static final String SELECTBYID="";
		private static final String SELECTBYNAME="";
	
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean save() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Disc> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Disc getDiscByArtist() {
		// TODO Auto-generated method stub
		return null;
	}

	public Disc getDiscbySong() {
		// TODO Auto-generated method stub
		return null;
	}

}
