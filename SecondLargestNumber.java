import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(SecondLargestNumber(arr));
    }
    public static int SecondLargestNumber(int arr[]){
        int largestNum = arr[0];
        int secondLargest = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largestNum){
                secondLargest=largestNum;
                largestNum=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largestNum){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}