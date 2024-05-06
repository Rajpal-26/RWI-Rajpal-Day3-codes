
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        PrintValues(a,b,n);
    }
    public static void PrintValues(int a , int b,int n){
        int c;
        for(int i=0;i<n;i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }

    }
}
