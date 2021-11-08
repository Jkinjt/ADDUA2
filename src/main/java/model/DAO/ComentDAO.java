package model.DAO;

import java.util.List;

import model.Coment;

public interface ComentDAO {
	
	List<Coment> getAll();
	
	boolean delete();
	boolean save();
	boolean update();

}
