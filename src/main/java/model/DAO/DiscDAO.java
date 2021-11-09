package model.DAO;

import java.util.List;

import model.Disc;
import model.Song;

public interface DiscDAO extends DAO {
	
	List<Disc> getAll();
	
	
		
	List<Song> getSongs();
		
	Disc getDiscByArtist();
	Disc getDiscbySong();
	
	
	

}
