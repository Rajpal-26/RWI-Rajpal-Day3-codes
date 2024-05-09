import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows");
        int m = sc.nextInt();
        System.out.println("Enter the value of column");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
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

        Multiplication(m,n,arr,brr);

    }

    public static void Multiplication(int m,int n,int arr[][],int brr[][]) {
        int product[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                product[i][j] = arr[i][j] * brr [j][i];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
}