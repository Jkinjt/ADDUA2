package launch;

import java.util.List;

import model.Artist;
import model.MariaDB.ArtistDaoImpMariaDB;

public class Executable {

	public static void main(String[] args) {
		testUpdateArtist();

	}
	
	static void  testSaveArtist() {
		ArtistDaoImpMariaDB a=new ArtistDaoImpMariaDB("Jose Mari","español","./foto");
		a.save();
		
	}
	
	static void testGetAllArtist() {
		ArtistDaoImpMariaDB a=new ArtistDaoImpMariaDB();
		List<Artist> al=a.getAll();
		System.out.println(al.toString());
	}
	
	static void testDeleteArtist() {
		ArtistDaoImpMariaDB a=new ArtistDaoImpMariaDB("Jose Mari","español","./foto");
		a.save();
		System.out.println(a.getId());
		a.delete();
		
	}
	static void testUpdateArtist() {
		ArtistDaoImpMariaDB a=new ArtistDaoImpMariaDB("Jose Mari","español","./foto");
		a.getArtistById(7);
		System.out.println(a.getId()+" "+a.getName());
		a.setName("Leticia Sabater");
		System.out.println(a.getName());
		a.update();
	}
	static void testGetArtistById() {
		ArtistDaoImpMariaDB a=new ArtistDaoImpMariaDB();
		System.out.println(a.getArtistById(7));
	}

}
