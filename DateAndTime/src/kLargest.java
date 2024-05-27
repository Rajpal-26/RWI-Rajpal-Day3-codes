import java.util.*;

public class kLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();

        Arrays.sort(arr);
        int kmax = 0;
        int kmin = 0;
        for(int i=0;i<k;i++){
            kmin = arr[i];
        }
        System.out.println(kmin);
        for(int j=n-1;j>=0;j--){
            kmax = arr[k];
        }
        System.out.println(kmax);
    }
}
