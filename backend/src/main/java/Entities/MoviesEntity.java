package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Movies.findAll",query = "SELECT e FROM MoviesEntity e ORDER BY e.id ASC"),
	@NamedQuery(name="Movies.findByName",query="SELECT e FROM MoviesEntity e WHERE e.movieName=?")
})
public class MoviesEntity {
	@Id
	@GenericGenerator(name = "customuid", strategy = "uuid2")
	@GeneratedValue(generator = "customuid")
	private String movieid;
	private String movieName;
	private int movieRating;
	private String cast;

	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	
}
