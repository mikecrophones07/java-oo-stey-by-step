package practice08;


public class Teacher extends Person {
    private Klass klass;
    private Integer id;

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.id = id;
    }

    public Teacher(Integer id, String name, Integer age){
        super(name, age);
        this.id = id;
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

    public String introduceWith(Student student){
        StringBuilder tempStr = new StringBuilder();
        if(klass.getNumber() != student.getKlass().getNumber()) {
            return tempStr.append(super.introduce()).append(" I am a Teacher. I don't teach ").append(student.getName()).append(".").toString();
        }
        else{
            return tempStr.append(super.introduce()).append(" I am a Teacher. I teach ").append(student.getName()).append(".").toString();
        }
    }
}
