package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members=new ArrayList<>();
    private List<Teacher> observers=new ArrayList<>();

    public void attach(Teacher teacher){
        observers.add(teacher);
    }

    public void notifyUpdateClass(Student student){
        for (Teacher observer : observers) {
            observer.updateClass(student,this);
        }
    }

    public void notifyUpdateLeader(){
        for (Teacher observer : observers) {
            observer.updateLeader(leader,this);
        }
    }

    public Klass(int number, Student leader) {
        this.number = number;
        this.leader = leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public List<Student> getMembers() {
        return members;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student leader) {
        if (members.contains(leader)) {
            this.leader = leader;
            notifyUpdateLeader();
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        members.add(student);
        notifyUpdateClass(student);
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        if (number > 0) {
            return "Class " + number;
        } else {
            return "No Class";
        }
    }

    public boolean isIn(Student student){
        return this.equals(student.getKlass());
    }
}

