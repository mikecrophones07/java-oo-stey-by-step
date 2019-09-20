package practice07;

import practice04.Person;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, Integer age){
        super(name, age);
    }


    public Klass getKlass(){
        return klass;
    }

    @Override
    public String introduce(){
        StringBuilder tempStr = new StringBuilder();
        if(klass == null){
            return tempStr.append(super.introduce()).append(" I am a Teacher. I teach No Class.").toString();
        }
        else {
            return tempStr.append(super.introduce()).append(" I am a Teacher. I teach ").append(klass.getDisplayName()).append(".").toString();
        }
    }
}
