import java.util.Scanner;

public class PrimeNumber {
    static int i=2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not Prime");
        }
    }
    public static boolean isPrime(int n){
        if(i==n/2+1){
            return true;
        }
        if(n%i==0){
            return false;
        }
        i++;
        return isPrime(n);
    }
}
