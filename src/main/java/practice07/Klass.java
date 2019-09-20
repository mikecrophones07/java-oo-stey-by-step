package practice07;

public class Klass {

    private Integer number;

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
}
