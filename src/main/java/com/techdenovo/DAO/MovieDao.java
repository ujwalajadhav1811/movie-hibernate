package com.techdenovo.DAO;

import java.util.List;

import com.techdenovo.model.Movie;

public interface MovieDao
{
	public int addMovie(Movie movie);
	 public List<Movie> getAllMovies();
	 public  Movie findMovieById(int id); 
	 public void movieUpdate(Movie movie );
	 public void movieDelete(Movie movie);

	}

