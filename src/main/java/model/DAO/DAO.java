package model.DAO;

import java.util.List;

import model.Song;

public interface DAO<t> {

	List<t> getAll();

	boolean delete();

	boolean save();

	boolean update();

}
