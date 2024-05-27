import java.sql.*;

public class connect {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully !!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        String url ="jdbc:mysql://localhost:3360/Company";
        String username ="root";
        String password ="root";
        String query = "select * from employee;";

        try{
            Connection connect = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successfully established!!");
            System.out.println("Connection id :- "+connect);

            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_position = rs.getString("job_position");
                String salary = rs.getString("salary");

                System.out.println();
                System.out.println("ID is "+ id);
                System.out.println("NAME is "+ name);
                System.out.println("JOB POSITION is " + job_position);
                System.out.println("SALARY is "+ salary);
            }
            rs.close();
            st.close();
            connect.close();
            System.out.println();
            System.out.println("Connection closed successfully!!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
