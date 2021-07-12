package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entities.MoviesEntity;
import Repositiries.MovieRepo;

@Service
public class MovieServiceImp implements MovieService {

	@Autowired
	MovieRepo mi;

	@Override
	public List<MoviesEntity> getAll() {
		// TODO Auto-generated method stub
		return mi.findAllMovies();
	}

	@Override
	public MoviesEntity getById(int Id) {
		// TODO Auto-generated method stub
		return mi.findById(Id);
	}

	@Override
	public List<MoviesEntity> getByActor(String aname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MoviesEntity> getByRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoviesEntity createMovie(MoviesEntity mov) {
		// TODO Auto-generated method stub
		return mi.createMovie(mov);
	}
}
