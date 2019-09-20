package practice02;

public class Student {
    private String name;
    private Integer klass;
    private Integer age;

    public Student(String name, Integer age, Integer klass){
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public Integer getKlass(){
        return klass;
    }

    public String introduce(){
        StringBuilder tempStr = new StringBuilder();
        return tempStr.append("I am a Student. I am at Class ").append(klass).append(".").toString();
    }
}
