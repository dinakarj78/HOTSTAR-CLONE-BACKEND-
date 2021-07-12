package services;

import java.util.List;

import org.springframework.stereotype.Service;

import Entities.MoviesEntity;


public interface MovieService {
	public List<MoviesEntity> getAll();

	public MoviesEntity getById(int Id);

	public List<MoviesEntity> getByActor(String aname);

	public List<MoviesEntity> getByRating(int rating);
	 public MoviesEntity createMovie(MoviesEntity mov);

}
