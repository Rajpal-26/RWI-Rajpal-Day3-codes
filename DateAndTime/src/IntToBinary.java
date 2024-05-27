import java.util.*;
public class IntToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum=0;
        int arr[]= new int[100];
        int i=0;
        while(n>0){
            arr[i]= n%2;
            sum = sum + arr[i];
            n = n/2;
//            i++;
        }
        System.out.println(sum);
    }
}
