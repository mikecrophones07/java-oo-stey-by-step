package practice11;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class Teacher extends Person {

    private LinkedList<Klass> linkedList;
    private Integer id;

    public Teacher(Integer id, String name, Integer age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
        this.id = id;
        this.linkedList.forEach(klassList -> klassList.addObserver(this));
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
        StringBuilder tempStr = new StringBuilder();
        if(linkedList.contains(student.getKlass())){
            if(student.getKlass().getLeader() != null){
                tempStr.append("I am ").append(getName()).append(". I know ").append(student.getName()).append(" become Leader of ").append(student.getKlass().getDisplayName()).append(".\n");
                System.out.append(tempStr.toString());
                return true;
            }
            tempStr.append("I am ").append(getName()).append(". I know ").append(student.getName()).append(" has joined ").append(student.getKlass().getDisplayName()).append(".\n");
            System.out.append(tempStr.toString());
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

    @Override
    public void update(Observable o, Object student) {
        isTeaching((Student) student);
    }
}
