package data;

public class School {
    private String name;
    private int affiliationCode;

    public School(){

    }
    public School(String name , int affiliationCode){
        this.affiliationCode = affiliationCode;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAffiliationCode() {
        return affiliationCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAffiliationCode(int affiliationCode) {
        this.affiliationCode = affiliationCode;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", affiliationCode=" + affiliationCode +
                '}';
    }
}
