package model.DAO;

import java.util.List;

import model.Disc;
import model.Song;

public interface SongDAO extends DAO{
	
	List<Song> getAll();
	
	
	List<Song> getSongsByDisc();
}
