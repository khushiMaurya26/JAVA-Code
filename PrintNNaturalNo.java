import java.util.Scanner;
public class PrintNNaturalNo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = 0;

    int i = 1;
    while(i <= n) {
      sum += i;
      i++;
    }
    System.out.println("Sum of no. is : " + sum);
  }
  
}
