package data;

public class Student {
    private String Studentname;
    private int rollNo;
    private int className;

    public Student(){

    }
    public void Student(int rollNo,String Studentname,int className){
        this.className=className;
        this.Studentname=Studentname;
        this.rollNo=rollNo;
    }


    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Studentname='" + Studentname + '\'' +
                ", rollNo=" + rollNo +
                ", className=" + className +
                '}';
    }
}
