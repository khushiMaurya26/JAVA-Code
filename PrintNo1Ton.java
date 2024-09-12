import java.util.Scanner;
public class PrintNo1Ton {
  
  public static void main(String args[]) {
    System.out.println("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    
    int counter = 1;

    while(counter <= range) {
      System.out.println(counter);
      counter++;
    }
    System.out.println("Print number from 1 to n");
  }
}
