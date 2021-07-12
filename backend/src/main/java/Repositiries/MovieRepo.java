package Repositiries;

import java.util.List;

import org.springframework.stereotype.Component;

import Entities.MoviesEntity;

@Component
public interface MovieRepo {
	public MoviesEntity findById(int Id);

	public List<MoviesEntity> findAllMovies();

	public MoviesEntity createMovie(MoviesEntity mov);

	
}
