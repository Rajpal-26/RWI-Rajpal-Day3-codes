import data.School;
import data.Student;
import data.Subjects;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        School school = new School();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter school Name");
        school.setName(sc.nextLine());
        System.out.println("Enter school affiliation code");
        school.setAffiliationCode(sc.nextInt());

        Student student = new Student();
        System.out.println("Enter Class Name");
        student.setClassName(sc.nextInt());
        System.out.println("Enter Roll no");
        student.setRollNo(sc.nextInt());
        System.out.println("Enter Student Name");
        student.setStudentname(sc.nextLine());

        Subjects subjects = new Subjects();
        subjects.setMaths("maths");
        subjects.setEnglish("english");
        subjects.setScience("science");

        System.out.println(school.toString());
        System.out.println(student.toString());
        System.out.println(subjects.toString());
    }
}