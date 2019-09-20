package practice08;

public class Klass {

    private Integer number;
    private Student leader;

    public Klass(Integer number){
        this.number = number;
    }

    public Integer getNumber(){
        return number;
    }

    public String getDisplayName(){
        StringBuilder str = new StringBuilder();
        return str.append("Class ").append(number).toString();
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public Student getLeader(){
        return leader;
    }
}
