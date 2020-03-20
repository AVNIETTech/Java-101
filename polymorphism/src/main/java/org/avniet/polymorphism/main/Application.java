package org.avniet.polymorphism.main;

import org.avniet.polymorphism.models.Person;

public class Application {

    public static void main(String[] args) {
        personService = new PersonService();
        createDefaultPerson();
        createPersonWithTwoParameters("Harry Potter", 24);
        createProfessional("David Herbert", 45, "Software Engineer");
    }

    public static void createDefaultPerson() {
        boolean defaultPersonCreated = personService.createNewPerson();
        System.out.println("Person created with no default values - "+defaultPersonCreated);
    }

    public static void createPersonWithTwoParameters(String name, int age) {
        Person newPersonWithNameAge = new Person(name, age);
        newPersonWithNameAge.setEmployed(false);
        printCreatedPerson(newPersonWithNameAge);
    }

    public static void createProfessional(String name, int age, String profession) {
        Person professionalPerson = personService.createNewPerson(name, age, true, profession);
        printCreatedPerson(professionalPerson, true);

    }

    public static void printCreatedPerson(Person person) {
        System.out.println("Created a person with two values.");
        System.out.println("Name: "+ person.getName());
        System.out.println("Age: "+ person.getAge());
    }

    public static void printCreatedPerson(Person person, boolean isWorking) {
        System.out.println("Created a person who has a job.");
        System.out.println("Name: "+ person.getName());
        System.out.println("Age: "+ person.getAge());
        if(isWorking)
            System.out.println("Works as: "+ person.getProfession());
        else
            System.out.println("Jobless as of now.");
    }

    static PersonService personService;
}
