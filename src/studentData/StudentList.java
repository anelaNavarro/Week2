package studentData;

/**
 *
 * @author Anela Navarro
 */
import java.util.Scanner;
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Student s1 = new Student("Anela");
//        Student s2 = new Student();
        Scanner input = new Scanner(System.in);
//        System.out.println("Insert Name: ");
//        s2.setStudentName(input.nextLine());
//
//        System.out.println("Student name: ");
//        System.out.println(s1.getStudentName() + " " + s2.getStudentName());
        
        Student[] studList = new Student[5];
        for(int i = 0;i<studList.length;i++)
        {
            System.out.println("Enter Student Name: ");
            String name = input.nextLine();
            
            Student s = new Student(name);
            studList[i]=s;
        }
        
        for(Student s: studList)
        {
            System.out.println(s.getStudentName());
        }
        
    

} 
}
