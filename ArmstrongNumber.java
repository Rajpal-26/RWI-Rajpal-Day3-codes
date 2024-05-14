import java.util.*;
public class ArmstrongNumber {
    int temp ;
     public int CalculateArmstrong(int n , int sum){
         if(n!=0){
             temp = n%10;
             sum = sum + temp*temp*temp;
             n = n/10;
             return CalculateArmstrong(n,sum);
         }
         return sum;
     }
    public static void main(String[] args) {
        ArmstrongNumber arm = new ArmstrongNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int result;
        for(int i=0;i<n;i++){
            result=arm.CalculateArmstrong(i,0);
            if(result==i){
                System.out.println(i);
            }
        }
    }
}
