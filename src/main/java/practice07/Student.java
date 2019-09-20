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

    @Override
    public String introduce(){
        StringBuilder tempStr = new StringBuilder();
        return tempStr.append(super.introduce()).append(" I am a Student. I am at ").append(klass.getDisplayName()).append(".").toString();
    }
}
