package practice08;

public class Klass {
    private int number;
    private Student leader;

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(int number, Student leader) {
        this.number = number;
        this.leader = leader;
    }

    public Klass(int number) {
        this.number = number;
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
}
