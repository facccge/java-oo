package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        }
    }

    public String introduceWith(Student student) {
        String teachString;
        if (klass.getNumber() == student.getKlass().getNumber()) {
            teachString = "teach";
        } else {
            teachString = "don't teach";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I " + teachString + " " + student.getName() + ".";
    }
}
