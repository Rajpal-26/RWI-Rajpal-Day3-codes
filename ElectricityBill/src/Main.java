import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units");
        int units = sc.nextInt();
        System.out.println("Electricity bill amount is Rs " + BillCalculate(units));
    }

    public static int BillCalculate(int units) {
        int billAmount=0 ;
        if (units <= 50) {
            return billAmount = units * 2;
        }
        else if (units<=100) {
            return billAmount = 50 * 2 + (units - 50) * 3;
        }
        else if (units <=200) {
           return  billAmount = 50 * 2 + 100 * 3 + (units - 150) * 4;
        }
        else if (units <=300) {
            return  billAmount = 50 * 2 + 100 * 3 + 200 * 4 + (units - 350) * 5;
        }
        else if (units <=400) {
            return  billAmount = 50 * 2 + 100 * 3 + 200 * 4 + 300 * 5 + (units - 650) * 6;
        }
        else if(units >400){
            return  billAmount = 50 * 2 + 100 * 3 + 200 * 4 + 300 * 5 + 400 * 6 + (units - 1050) * 6;
        }
        return 0;
    }
}