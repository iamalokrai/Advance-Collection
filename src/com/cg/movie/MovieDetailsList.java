package com.cg.movie;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Class having a collection of the movie details
public class MovieDetailsList {

	// Creating a collection of set
	Set<Movie_Details> movie = new LinkedHashSet<Movie_Details>();

	// method to add the movies details to the set
	public void add_movie(Movie_Details movies) {
		movie.add(movies);
	}

	// method to remove a movie by its name from the collection
	public void remove_movie(String moviename) {
		Predicate<Movie_Details> findbyname = Movie_Details -> (Movie_Details.getMov_Name().equals(moviename));
		movie.removeIf(findbyname);
	}

	// method to remove all movies from the set
	public void remove_AllMovies() {
		movie.clear();
	}

	// method to find a movie by name from set
	public boolean find_movie_by_mov_name(String movies) {
		Predicate<Movie_Details> findbyname = Movie_Details -> (Movie_Details.getMov_Name().equals(movies));
		return movie.stream().anyMatch(findbyname);
	}

	/*
	 * public boolean find_movie_by_genre() {
	 * 
	 * }
	 */

	public void display() {
		Consumer<Movie_Details> disp = System.out::println;
		movie.stream().forEach(disp);
	}

}
