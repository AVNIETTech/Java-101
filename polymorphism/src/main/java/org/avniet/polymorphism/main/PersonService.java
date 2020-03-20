package org.avniet.polymorphism.main;

import org.avniet.polymorphism.models.Person;

public class PersonService {

    public boolean createNewPerson() {
        Person person = new Person();
        return person != null;
    }

    public Person createNewPerson(String personName, int personAge) {
        Person newPerson = new Person(personName, personAge);
        return newPerson;
    }

    public Person createNewPerson(String personName, int personAge, boolean isEmployed, String profession) {
        Person newPerson = new Person(personName, personAge, isEmployed);
        newPerson.setProfession(profession);
        return newPerson;
    }
}
