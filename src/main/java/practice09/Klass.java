package practice09;

public class Klass {

    private Integer number;
    private Student leader ;


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
        if(number != student.getKlass().getNumber()){
            System.out.append("It is not one of us.\n");
        }
        else{
            this.leader = student;
        }
    }

    public Student getLeader(){
        return this.leader;
    }

    public void appendMember(Student student){

    }
}
