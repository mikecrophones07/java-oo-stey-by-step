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


}
