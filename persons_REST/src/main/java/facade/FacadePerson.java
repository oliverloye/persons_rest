/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import static Runner.Execute.personDB;
import entity.Person;
import java.util.List;

/**
 *
 * @author Oliver
 */
public class FacadePerson implements FacadePersonInterface {
    
    @Override
    public Person getPersonById(int id) {
        Person person;
            for (int i = 0; i < personDB.size(); i++) {
                if(personDB.get(i).getId() == id) {
                    person = personDB.get(i);
                    return person;
                }
            }
        return null;
        
        
    }

    @Override
    public Person createPerson(Person p) {
        personDB.add(p);
        return p;
    }

    @Override
    public void editPerson(int id, String firstname, String lastname) {
        for (int i = 0; i < personDB.size(); i++) {
            if(personDB.get(i).getId() == id) {
                personDB.get(i).setfName(firstname);
                personDB.get(i).setlName(lastname);
            }
        }
    }

    @Override
    public void deletePerson(int id) {
        for (int i = 0; i < personDB.size(); i++) {
            if(personDB.get(i).getId() == id) {
                personDB.remove(i);
            }
            
        }
    }

    @Override
    public List<Person> getAllPersons() {
        List<Person> persons = (List<Person>) personDB.clone();
        return persons;
    }
    
    

}
