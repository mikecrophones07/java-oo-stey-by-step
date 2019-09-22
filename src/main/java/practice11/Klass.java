package practice11;

import java.util.*;

public class Klass extends Observable {

    private Integer number;
    private Student leader;
    private List<Student> students;

    public Klass(Integer number){
        this.number = number;
        students = new ArrayList<>();
    }

    public Integer getNumber(){
        return number;
    }

    public String getDisplayName(){
        StringBuilder str = new StringBuilder();
        return str.append("Class ").append(number).toString();
    }

    public void assignLeader(Student student){
        if(number != student.getKlass().getNumber()){
            System.out.append("It is not one of us.\n");
        }
        else{
            this.leader = student;
            setChanged();
            notifyObservers(leader);
        }
    }

    public Student getLeader(){
        return leader;
    }


    public void appendMember(Student student){
        students.add(student);
        students.forEach(tempStudent -> tempStudent.isIn(this));
        setChanged();
        notifyObservers(student);
    }
}
