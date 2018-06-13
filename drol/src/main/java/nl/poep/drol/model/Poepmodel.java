package nl.poep.drol.model;

import nl.poep.drol.controllers.poepcontroller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Poepmodel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

int personID;
//String friendsName;
String joke;
String yomom;

//public Poepmodel() {}


public Poepmodel(){
  this.personID = personID;
//  this.friendsName = friendsName;
  this.joke = joke;
  this.yomom = yomom;
}
public int getPersonID(){return personID;}
public int setPersonID(int personID){return this.personID = personID;}

//public String getFriendsName(){return friendsName;}
//public String setFriendsName(String friendsName){return this.friendsName = friendsName;}
public String getJoke(){return joke;}
public String setJoke(String joke){return this.joke = joke;}
public String getYomom(){return yomom;}
public String setYomom(String yomom){return this.yomom = yomom;}


@Override
public String toString(){
  return "[Poepmodel [" + " personID: " + personID + "," + "joke:" + joke + "yomom:" + yomom + "]";
}

}
