package data;

public class Subjects {
    private String maths;
    private String science;
    private String english;

    public Subjects(String science,String maths,String english){
        this.english=english;
        this.maths=maths;
        this.science=science;
    }

    public Subjects() {

    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "maths='" + maths + '\'' +
                ", science='" + science + '\'' +
                ", english='" + english + '\'' +
                '}';
    }
}
