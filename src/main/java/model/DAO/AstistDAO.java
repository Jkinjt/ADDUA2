package model.DAO;

import java.util.List;

import model.Artist;

public interface AstistDAO {

	List<Artist> getAll();
	boolean delete();
	boolean save();
	boolean Update();
	
	Artist getArtistById();
	
	Artist getArtistByName();
	
	
	
	
}
