package practice11;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {

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

    public boolean equals(Object second) {
        if (!(second instanceof Object))
            return false;
        Person temp = (Person) second;
        return this.name == temp.name && this.id == temp.id && this.age == temp.age;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
