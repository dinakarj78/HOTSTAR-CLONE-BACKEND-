package Repositiries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import Entities.MoviesEntity;

@Repository
public class MoviesRepoImp implements MovieRepo {
	@PersistenceContext
	EntityManager em;

	@Override
	public MoviesEntity findById(int Id) {
		// TODO Auto-generated method stub
		return em.find(MoviesEntity.class, Id);
	
	}

	@Override
	public List<MoviesEntity> findAllMovies() {
		// TODO Auto-generated method stub
		TypedQuery<MoviesEntity> query=em.createNamedQuery("Movies.findAll", MoviesEntity.class);
		return query.getResultList();
	}

	@Override
	public MoviesEntity createMovie(MoviesEntity mov) {
		// TODO Auto-generated method stub
		 em.persist(mov);
		 return mov;	
	}

}
