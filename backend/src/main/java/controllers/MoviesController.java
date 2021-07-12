	package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Entities.MoviesEntity;
import services.MovieService;

@RestController
/*@ResponseBody*/
@RequestMapping(path="moviesentity")
public class MoviesController {

	@Autowired
	MovieService ms;
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<MoviesEntity> getAll() {
		return ms.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public MoviesEntity getAll(@PathVariable("name")int id) {
		return ms.getById(id);
	}

	@RequestMapping(method = RequestMethod.GET, path = "{Actorname}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<MoviesEntity> getByActor(@PathVariable("Actorname") String Actname) {
		return ms.getByActor(Actname);
	}

	@RequestMapping(method = RequestMethod.GET, path = "{Rating}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<MoviesEntity> getByRating(@PathVariable("Rating") int Rating) {
		return ms.getByRating(Rating);
	}
	
	@RequestMapping(method=RequestMethod.POST,path="{new}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
     public  MoviesEntity createmve(@RequestBody MoviesEntity emp) {
		return ms.createMovie(emp);
	}
}
	
