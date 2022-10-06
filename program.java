import java.util.Scanner;
 /**
  * program
  */
 public class program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st Value :"); 
    int i = sc.nextInt();
    System.out.println("Enter 2nd Value :");
    int j = sc.nextInt(); 
    program obj = new program();
  add(i, j);
  obj.sub(i, j);
  mul(i, j);
  }
 static void add(int a , int b) {
     long c = a + b ;
    System.out.println("Sum of both values is : " + c );
  }
  void sub(int a , int b) {
    long c = a - b ;
   System.out.println("Subtraction of both values is : " + c );
 }
 static void mul(int a , int b) {
  long c = a * b ;
 System.out.println("Multiplication of both values is : " + c );
}
 }
