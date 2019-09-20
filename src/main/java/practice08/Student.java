package practice08;

import practice08.Klass;

public class Student extends Person{

    private Klass klass;
    private Integer id;

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.id = id;
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
