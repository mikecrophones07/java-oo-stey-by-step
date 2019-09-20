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
    
}
