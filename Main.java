import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // TODO: Problem 1
    System.out.println("Enter two integers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    if (num2 == 0)
    {
      System.out.println("DivideByZero Exception");
    }
    else
    {
      double ratio = (double) num1/num2;
      if (1<ratio && ratio<8)
      {
        System.out.println("Ratio OK");
      }

    }

    // TODO: Problem 2
    // System.out.println("Enter two integers: ");
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // if (b==0)
    // {
    //   System.out.println("Division error");
    // }
    // else
    // {
    //   if (a%b == 0)
    //   {
    //   System.out.println("Is a factor");
    //   }
    // }
    

    // TODO: Problem 3
    System.out.println("");




  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    boolean WidthEqual = r1.getWidth() == r2.getWidth();
    boolean LengthEqual = r1.getLength() == r2.getLength();
    return WidthEqual && LengthEqual;
  }
}
