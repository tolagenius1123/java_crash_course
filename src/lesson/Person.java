package lesson;

import lesson.Name;

public class Person {

    private Name personName;

    public Person(Name personName) {
        this.personName = personName;
    }

    public  Person () {
        /*
        Default constructor
         */
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello "+ name;
    }
}
