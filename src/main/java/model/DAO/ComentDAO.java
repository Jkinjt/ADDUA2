package model.DAO;

import java.util.List;

import model.Coment;

public interface ComentDAO extends DAO {
	
	List<Coment> getUserListComent();
			
	List<Coment> getComentAnswer();
	

}
