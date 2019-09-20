package practice08;

public class Teacher extends Person {
    private Klass klass;
    private Integer id;

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.id = id;
    }

    public Klass getKlass(){
        return klass;
    }
}
