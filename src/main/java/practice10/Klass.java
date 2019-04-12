package practice10;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members=new ArrayList<>();

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
        }else{
            System.out.print("It is not one of us.\n");
        }

    }

    public void appendMember(Student student) {
        members.add(student);
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

