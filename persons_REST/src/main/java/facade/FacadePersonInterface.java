package facade;

import entity.Person;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oliver
 */
public interface FacadePersonInterface {

    public Person getPersonById(int id);
    public Person createPerson(Person p);
    public void editPerson(int id, String firstname, String lastname);
    public void deletePerson(int id);
    public List<Person> getAllPersons();

}
