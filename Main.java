import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1 - Create a scanner and an array of size 3
    Scanner scan = new Scanner(System.in); 
    double[] vals = new double[3];

    System.out.println("Input 3 doubles");
    
    vals[0] = scan.nextDouble();
    vals[1] = scan.nextDouble();
    vals[2] = scan.nextDouble();

    System.out.println(vals[0] + vals[1] + vals[2]);
    // Problem 2
    // Use the scanner to get user input and give it to the method

    int N = scan.nextInt();
    int[] output = sumsOfNums(N);
  }

  public static int[] sumsOfNums(int input)
  {
    // Implement Problem 2 here
    int[] values = new int[input];
    for (int i = 0; i < values.length; i++)
    {
      int sum = 0;
      for (int j = 0; j <= i; j++)
      {
        sum += j;
      }

      values[i] = sum;

    }
    return values;
  }
}
