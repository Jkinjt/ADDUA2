package model.DAO;

import java.util.List;

import model.Song;
import model.User;

public interface UserListDAO extends DAO{
	
	List<User> getUsers();
	List<Song> getSongs();
	User getCreator();
	
}
