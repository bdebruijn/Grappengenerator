package nl.poep.drol.service;
import nl.poep.drol.controllers.poepcontroller;

import nl.poep.drol.model.Poepmodel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Poepservice extends CrudRepository<Poepmodel, Long>{

}
