import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows");
        int m = sc.nextInt();
        System.out.println("Enter the value of column");
        int n = sc.nextInt();

        int arr[][]= new int[m][n];
        int brr[][] = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        lowerTriangle(m,n,arr);
        upperTriangle(m,n,brr);
    }
    public static void lowerTriangle(int m,int n,int arr[][]){
        System.out.println("Lower Triangle");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j>i){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void upperTriangle(int m,int n,int brr[][]){
        System.out.println("Upper Triangle");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>j){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print(brr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}