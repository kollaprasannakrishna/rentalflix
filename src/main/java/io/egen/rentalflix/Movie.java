package io.egen.rentalflix;

/**
 * Entity representing a movie.
 * Fields: id, title, year, language
 */
public class Movie {
	//POJO IMPLEMENTATION GOES HERE
	private int id;
	private String title;
	private int year;
	private String language;
	private boolean rented;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Movie(){
		
	}
	public Movie(int id, String title, int year, String language,boolean rented) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.language = language;
		this.setRented(rented);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isRented() {
		return rented;
	}
	public void setRented(boolean rented) {
		this.rented = rented;
	}
}
