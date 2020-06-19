package designPatterns.MVCPattern;

public class MVCPatternDemo {

    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        Student model = retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() {
        return new Student("Robert","10");
    }

}
