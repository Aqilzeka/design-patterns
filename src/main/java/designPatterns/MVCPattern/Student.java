package designPatterns.MVCPattern;

public class Student {

    private final String rollNo;
    private final String name;

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

}