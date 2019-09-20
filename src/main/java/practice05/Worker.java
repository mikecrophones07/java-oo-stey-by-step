package practice05;

import practice04.Person;

public class Worker extends Person {

    public Worker(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String introduce(){
        StringBuilder tempStr = new StringBuilder();
        return tempStr.append(super.introduce()).append(" I am a Worker. I have a job.").toString();
    }
}
