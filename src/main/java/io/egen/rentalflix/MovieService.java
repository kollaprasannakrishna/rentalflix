package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {
	List<Movie> movieStore=new ArrayList<Movie>();
	Iterator<Movie> loop=movieStore.iterator();

	public List findAll() {
		// TODO Auto-generated method stub
		
		return movieStore;
	}

	public List findByName(String name) {
		// TODO Auto-generated method stub
		List<Movie> similarMovies=new ArrayList<Movie>(); 
		for(Movie it:movieStore){
			if(it.getTitle().equals(name)){
				similarMovies.add(it);
			}
		}
		return similarMovies;
	}

	public Movie create(Movie movie) {
		// TODO Auto-generated method stub
		for(Movie it:movieStore){
			if(it.getId()== movie.getId()){
				throw new IllegalArgumentException("Movie with that Id already existed");
			}
		}
		movieStore.add(movie);
		return movie;
	}

	public Movie update(Movie movie) {
		// TODO Auto-generated method stub
		Movie updatedMovie=new Movie();
		boolean movieFound=false;
		for(Movie it:movieStore){
			if(it.getId()== movie.getId()){
				it.setTitle(movie.getTitle());
				it.setLanguage(movie.getLanguage());
				it.setYear(movie.getYear());
				updatedMovie=it;
				movieFound=true;
			}else{
				movieFound=false;
			}
		}
		if(movieFound){
			return updatedMovie;
		}else{
			throw new IllegalArgumentException("Movie with that Id already existed");
		}
		
		
	}

	public Movie delete(int id) {
		boolean movieAvailable=false;
		Movie removeThis=new Movie();
		for(Movie it : movieStore){
			if(id==it.getId()){
				removeThis=it;
				movieAvailable=true;
			}else{
				movieAvailable=false;
			}
		}
		if(movieAvailable){
			movieStore.remove(removeThis);
		}else{
			throw new IllegalArgumentException("Movie with that id is not available");
		}
		return null;
	}

	public boolean rentMovie(int movieId, String user) {
		boolean movieAvailable=false;
		Movie movie=new Movie();
		for(Movie it : movieStore){
			if(movieId==it.getId()){
				movie=it;
				movieAvailable=true;
			}else{
				movieAvailable=false;
			}
		}
		if(movieAvailable){
			if(movie.isRented()){
				throw new IllegalArgumentException("Already rented!!");
			}else{
				return true;
			}
		}else{
			throw new IllegalArgumentException("Movie not availbe in the store.");
		}
		
		//return false;
	}

}
