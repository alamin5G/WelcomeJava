package Chapter_10;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String student){
        //code here
        int position = 0;
        for(int i = 0; i < numberOfStudents; i++){
            if(students[i].equals(student)){
                position = i;
                students[position] = null;
                break;
            }
        }
        for(int i = position; i < numberOfStudents-1; i++){
            students[i] = students[i+1];
        }

    }

    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return students.length;
    }
}

class TestCourse {
    public static void main(String[] args) {
        Course c = new Course("Java");
        Course c2 = new Course("JavaScript");
        Course c3 = new Course("Python");
        Course c4 = new Course("PHP");
        Course c5 = new Course("Web Design");

        c.addStudent("Alamin");
        c.addStudent("Bob");
        c.addStudent("Charlie");
        c.addStudent("David");
        c.addStudent("Elli");

        c2.addStudent("Fred");
        c2.addStudent("Gary");
        c2.addStudent("Harry");
        c2.addStudent("Jack");

        c3.addStudent("John");
        c3.addStudent("Mary");
        c3.addStudent("Mike");
        c3.addStudent("Natal");

        c4.addStudent("Paul");
        c4.addStudent("Peter");

        c5.addStudent("Rahim");
        c5.addStudent("Sam");
        c5.addStudent("Tim");

        System.out.println("Number of students in Course 1: " + c.getNumberOfStudents());
        String[] students = c.getStudents();
        for(int i = 0; i < students.length; i++){
            System.out.print(students[i] + ", ");
        }


        System.out.println("Number of Student in Course 2: " + c2.getNumberOfStudents());
    }
}

