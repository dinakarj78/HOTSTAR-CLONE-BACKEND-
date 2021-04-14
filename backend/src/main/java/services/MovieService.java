package services;

import java.util.List;

import org.springframework.stereotype.Service;

import Entities.MoviesEntity;

@Service
public interface MovieService {
   public List<MoviesEntity> getAll();
   public MoviesEntity getByName(String name);
   public List<MoviesEntity>  getByActor(String aname);
   public List<MoviesEntity> getByRating(int rating);
   

}
