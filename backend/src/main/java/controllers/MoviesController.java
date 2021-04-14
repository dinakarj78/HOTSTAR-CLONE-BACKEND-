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

import Entities.MoviesEntity;
import services.MovieService;

@Controller
@ResponseBody
public class MoviesController {
	
	 @Autowired  MovieService ms;
	 @RequestMapping(method=RequestMethod.GET,path="/movies",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public List<MoviesEntity> getAll(){
		 return ms.getAll();
	 }
	 @RequestMapping(method=RequestMethod.GET,path="/movies/{name}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public MoviesEntity getAll(@PathVariable("name") String name){
		 return ms.getByName(name);
	 }
	 @RequestMapping(method=RequestMethod.GET,path="/movies/{Actorname}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public List<MoviesEntity>getByActor(@PathVariable("Actorname") String Actname) {
		 return ms.getByActor(Actname);
	 }
	 @RequestMapping(method=RequestMethod.GET,path="/movies/{Rating}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 public List<MoviesEntity> getByRating(@PathVariable("Rating") int Rating){
		 return ms.getByRating(Rating);
	 }
  
}
