package model.DAO;

import java.util.List;

import model.Artist;
import model.Disc;
import model.Song;

public interface AstistDAO extends DAO {

	List<Artist> getAll();
	
	
	Artist getArtistById(int id);
	
	Artist getArtistByName(String name);
	
	List<Disc> getArtitsDiscs();
	
	List<Song> getArtitsSongs();
	
	
	
	
	
}
