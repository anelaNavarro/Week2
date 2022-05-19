package studentData;

/**
 * Insert Description
 * @author Anela Navarro
 */
public class Student {
    
    private String studentName;
    
    public Student(String studentName)
    {
        this.studentName = studentName;
    }

    Student() {
    }
    
    public String getStudentName()
    {
        return studentName;
    }
    
    public void setStudentName (String studentName)
    {
        this.studentName = studentName;
    }
    
    

}
