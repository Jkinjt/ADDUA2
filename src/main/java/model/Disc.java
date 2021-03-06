/**
 * 
 */
package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jkin
 *
 */
public class Disc {
	protected int id;
	protected String name;
	protected String picture;
	protected LocalDateTime date;
	protected int reproductions;
	protected Artist artist;
	protected List<Song> songs;
	
	
	
	
	public Disc() {
		this.id=-1;
		this.name="";
		this.picture="";
		this.date=LocalDateTime.now();
		this.reproductions=-1;
		this.artist=new Artist();
		this.songs=new ArrayList<Song>();
	}
	
	//constructor sin cargar las canciones
	public Disc(int id, String name, String picture, LocalDateTime date, int reproductions, Artist artist) {
		super();
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.date = date;
		this.reproductions = reproductions;
		this.artist = artist;
	}


	public Disc(int id, String name, String picture, LocalDateTime date, int reproductions, Artist artist,
			List<Song> songs) {
		super();
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.date = date;
		this.reproductions = reproductions;
		this.artist = artist;
		this.songs = songs;
	}
	
	public Disc(Disc disc) {
		this.id = disc.id;
		this.name = disc.name;
		this.picture = disc.picture;
		this.date = disc.date;
		this.reproductions = disc.reproductions;
		this.artist = disc.artist;
		this.songs = disc.songs;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Disc(String name) {
		super();
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public int getReproductions() {
		return reproductions;
	}
	public void setReproductions(int reproductions) {
		this.reproductions = reproductions;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	

}
