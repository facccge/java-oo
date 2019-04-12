package practice11;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes = new LinkedList<>();

    public List<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);

    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for(Klass klass:classes){
            klass.attach(this);
        }
    }

    @Override
    public String introduce() {
        if (classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String classesString = "Class ";
            for(Klass klass:classes){
                classesString+=klass.getNumber()+", ";
            }
            classesString = classesString.substring(0,classesString.length()-2);
            return super.introduce() + " I am a Teacher. I teach " + classesString + ".";
        }
    }

    public boolean isTeaching(Student student){
        for(Klass klass:classes){
            if(klass.isIn(student)){
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        String teachString;
        if (classes.contains(student.getKlass())) {
            teachString = "teach";
        } else {
            teachString = "don't teach";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I " + teachString + " " + student.getName() + ".";
    }

    public void updateClass(Student student,Klass klass){
        System.out.print("I am Tom. I know "+student.getName()+" has joined "+klass.getDisplayName()+".\n");
    }

    public void updateLeader(Student student,Klass klass){
        System.out.print("I am Tom. I know "+student.getName()+" become Leader of "+klass.getDisplayName()+".\n");
    }
}
