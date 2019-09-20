package practice07;

import practice04.Person;

public class Student extends Person {
    private Klass klass;

    public Student(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return klass;
    }
}
