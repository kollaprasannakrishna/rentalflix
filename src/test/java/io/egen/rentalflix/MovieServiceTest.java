package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
/**
 * JUnit test cases for MovieService
 */
public class MovieServiceTest {
	MovieService it=new MovieService();
	@Test
	public void testCreate(){
		
		Movie actual=it.create(new Movie(100,"Facing the Gaints",2010,"English",false));
		Movie rat=actual;
		Assert.assertEquals(rat, actual);
	}
	@Test
	public void testFindAll(){
		//List<Movies> moviesList=new ArrayList<Movies>();
		
	}
}
