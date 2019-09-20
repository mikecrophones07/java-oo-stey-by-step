package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

    private LinkedList<Klass> linkedList;
    private Integer id;

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
        this.id = id;
    }

    public Teacher(Integer id, String name, Integer age){
        super(id, name, age);
        this.id = id;
    }

    public LinkedList<Klass> getClasses(){
        return linkedList;
    }

    @Override
    public String introduce(){
        StringBuilder tempStr = new StringBuilder();
        if(linkedList == null){
            return tempStr.append(super.introduce()).append(" I am a Teacher. I teach No Class.").toString();
        }
        else {
            tempStr.append(super.introduce()).append(" I am a Teacher. I teach Class ");
            linkedList.forEach(obj -> tempStr.append(obj.getNumber()).append(", "));

            return tempStr.substring(0, tempStr.toString().length()-2).concat(".");
        }
    }

    public boolean isTeaching(Student student){
        if(linkedList.contains(student.getKlass())){
            return true;
        }
        return false;
    }

    public String introduceWith(Student student){
        StringBuilder tempStr = new StringBuilder();
        if(!linkedList.contains(student.getKlass())) {
            return tempStr.append(super.introduce()).append(" I am a Teacher. I don't teach ").append(student.getName()).append(".").toString();
        }
        else{
            return tempStr.append(super.introduce()).append(" I am a Teacher. I teach ").append(student.getName()).append(".").toString();
        }
    }

}
