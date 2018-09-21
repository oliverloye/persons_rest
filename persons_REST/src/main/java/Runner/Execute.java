package Runner;

import entity.Person;
import facade.FacadePerson;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oliver
 */
public class Execute {

    public static ArrayList<Person> personDB = new ArrayList<>();

    public static void main(String[] args) {
        FacadePerson fp = new FacadePerson();
        Person person1 = new Person(1, "Andreas", "Efternavn1");
        Person person2 = new Person(2, "Jonas", "Efternavn2");
        Person person3 = new Person(3, "Thomas", "Efternavn3");
        Person person4 = new Person(50, "Oliver", "Efternavn4");
        Person person5 = new Person(100, "Ulla", "Efternavn5");
        Person person6 = new Person(6, "Lars", "Efternavn5");
        
        personDB.add(person1);
        personDB.add(person2);
        personDB.add(person3);
        personDB.add(person4);
        fp.createPerson(person5);
        fp.createPerson(person6);
        

        //System.out.println(personDB);
        System.out.println(fp.getPersonById(1));
        System.out.println(fp.getPersonById(2));
        System.out.println(fp.getPersonById(3));
        System.out.println(fp.getPersonById(50));
        System.out.println(fp.getPersonById(100));
        fp.editPerson(100, "Allan", "Houdini");
        System.out.println(fp.getPersonById(100));
        System.out.println(fp.getPersonById(6));
        fp.deletePerson(6);
        System.out.println(fp.getPersonById(6));
        System.out.println("__________________________");
        
        System.out.println(personDB);
        
        
        
        
    }

}
