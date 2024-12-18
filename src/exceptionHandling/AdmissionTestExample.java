package exceptionHandling;

interface Test{
    public void showAdmissionInfo();
    public void isPassed() throws Exception;

}

abstract class Admission implements Test{

    abstract void enterExamMarks(int marks);
}

class AdmissionTest extends Admission{

    int marks;
    private String name;
    private String id;
    private String subject;

    public AdmissionTest(String name, String id, String subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    public void enterExamMarks(int marks){
        this.marks = marks;
    }

    public void showAdmissionInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Subject: "+subject);
        System.out.println("Marks: "+marks);
    }

    public void isPassed() throws Exception{
        if(marks >= 50){
            System.out.println("Passed");
        }else{
            throw new Exception("Failed!");
            //System.out.println("Failed");
        }
    }
}

public class AdmissionTestExample {
    public static void main(String[] args) {
        AdmissionTest admissionTest = new AdmissionTest("John Doe", "123456", "CSE");

        admissionTest.enterExamMarks(40);
        try{
            admissionTest.isPassed();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Admission Test Completed!");
            admissionTest.showAdmissionInfo();
        }
    }
}
