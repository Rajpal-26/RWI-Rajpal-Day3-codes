package collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        String dob = "26/08/2000";
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ld = LocalDate.parse(dob,dt);
        System.out.println(ld);

        //        DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
//        LocalDateTime current = LocalDateTime.now();
//        String result = current.plusDays(8).format(obj);
//        System.out.println(result);


        //        Scanner sc = new Scanner(System.in);
//        System.out.println("enter date in YYYY,M,DD format");
//        LocalDate date  = LocalDate.now();
//        System.out.println(date);
//        LocalDate yesterday = date.minusDays(1);
//        LocalDate tomorrow = date.plusDays(1);
//        System.out.println(tomorrow);
//        System.out.println(yesterday);




        //        LocalDate date = LocalDate.now();
//        System.out.println(date);
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//        LocalDateTime curr = LocalDateTime.now();
//        System.out.println(curr);
    }
}
