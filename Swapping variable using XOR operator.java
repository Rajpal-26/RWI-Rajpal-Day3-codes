import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();
        SwappingVariables(var1,var2);
    }
    public static void SwappingVariables(int var1,int var2)
    {
      var1 = var1 ^ var2;
      var2 = var1 ^ var2;
      var1 = var1 ^ var2;

      System.out.print(var1+" "+var2);

    }

}