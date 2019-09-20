package practice07;

import practice04.Person;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return klass;
    }
}
