import java.util.*;
public class EligilbilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        String eligibility = (age >= 18)?"You are eligible to vote":"YOu are not eligible to vote";
        System.out.println(eligibility);
    }
}
