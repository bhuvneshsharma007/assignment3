import java.util.Scanner;

public class sumoftwo {
   public static void main(String args[])
   {
      int x, y, z;
 
      System.out.println("Enter two no");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
 
      System.out.println("Sum  = " + z);
   }
}
