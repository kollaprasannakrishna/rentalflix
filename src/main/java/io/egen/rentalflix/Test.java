package io.egen.rentalflix;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieService newMovie=new MovieService();
		newMovie.create(new Movie(100,"Facing the Gaints",2014,"English",false));
		newMovie.create(new Movie(101,"Encounter",2012,"English",false));
		List<Movie> allMovies=newMovie.findAll();
		for(Movie ra:allMovies){
			System.out.println(ra.getId()+" "+ra.getTitle()+" "+ra.getYear()+" "+ra.getLanguage());
		}
		List<Movie> nameMovie=newMovie.findByName("Encounter");
		for(Movie ra:nameMovie){
			System.out.println(ra.getId()+" "+ra.getTitle()+" "+ra.getYear()+" "+ra.getLanguage());
		}
		newMovie.delete(101);
		for(Movie ra:allMovies){
			System.out.println(ra.getId()+" "+ra.getTitle()+" "+ra.getYear()+" "+ra.getLanguage());
		}
		boolean rented=newMovie.rentMovie(100, "Prasannna");
		System.out.print(rented);
		
	}

}
