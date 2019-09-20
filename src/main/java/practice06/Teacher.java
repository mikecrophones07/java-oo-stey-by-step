package practice06;

import practice04.Person;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass(){
        return klass;
    }

    @Override
    public String introduce(){
        StringBuilder tempStr = new StringBuilder();
        return tempStr.append(super.introduce()).append(" I am a Teacher. I am at Class ").append(klass).append(".").toString();
    }
}
