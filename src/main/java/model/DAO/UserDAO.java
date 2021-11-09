package model.DAO;

import java.util.List;

import model.Song;
import model.User;
import model.UserList;

public interface UserDAO extends DAO {
	
	List<User> getAllUsers();
	User getUserById();
	User getUserByName();
	//te devuelve las listas a las que se esta suscrito
	List<UserList> getListUser();
	//devuelve las listas que el usuario ha creado
	List<UserList> getCreatedList();
	List<Song> getSongsHeard();

}
