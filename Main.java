import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("hello", 5); 

    Scanner sc = new Scanner(System.in);
    int num; 
    System.out.println("How many rows of numbers do you want?");
    num = sc.nextInt(); 
    uprightNumberTriangle(num); 

    int number;
    System.out.println("Input a number"); 
    number = sc.nextInt(); 
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)  // for each letter in the word..
    { 
    String letter = word.substring(i, i+1);
    for (int j = 0; j < N; j++)              // print that letter N times (loop)
    {
      System.out.print(letter);
    }
    System.out.print(letter);
    }
    // code solution here
  }

  public static void printNums()
  {
    for (int rowNum = 10; rowNum >= 1; rowNum--)
    {
      for (int count = 1; count <= rowNum; count++)
      {
        System.out.print(rowNum + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int rowNum = 1; row <= N; rowNum++)
    {
      for (int current = 1; current <= row )
    }
    
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
