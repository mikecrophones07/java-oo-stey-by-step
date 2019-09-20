package practice08;

public class Person {

    private String name;
    private Integer age;
    private Integer id;

    public Person(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String introduce(){
        StringBuilder tempStr = new StringBuilder();
        return tempStr.append("My name is ").append(name).append(". I am ").append(age).append(" years old.").toString();
    }
}
