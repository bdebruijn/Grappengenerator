package nl.poep.drol.controllers;
import nl.poep.drol.model.Poepmodel;
import nl.poep.drol.service.Poepservice;

import java.awt.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;



@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class poepcontroller{

  @Autowired private Poepservice poepservice;

  @ResponseBody
  @RequestMapping (value = "/poep", method = RequestMethod.POST)
  public int create (@RequestBody Poepmodel poepmodel){

	  System.out.println(poepmodel);
    return poepservice.save(poepmodel).getPersonID();
  }
  @ResponseBody
  @RequestMapping (value = "/poep", method = RequestMethod.PUT)
  public int updatePoepmodel (@RequestBody Poepmodel poepmodel){
    return poepservice.save(poepmodel).getPersonID();
  }
  @ResponseBody
  @RequestMapping (value = "/poep", method = RequestMethod.GET)
  public Iterable<Poepmodel> findAll(){
    return poepservice.findAll();
  }
  @ResponseBody
  @RequestMapping (value = "/poepmodel{PersonID}", method = RequestMethod.GET)
  public Poepmodel PoepmodelByPersonID(@PathVariable long PersonID){
    return poepservice.findOne(PersonID);
  }
  @RequestMapping (value = "/page", method = RequestMethod.GET)
  public String page (){
    return "poepmodel";
    }
  }
