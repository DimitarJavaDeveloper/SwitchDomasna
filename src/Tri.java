import java.util.Scanner;
public class Tri {
public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
 int i,n ;//Ova e JAVA programa/
 System.out.print("Do brojot: ");
 n = input.nextInt();
 i=1;
 while (i <= n)
 {
 if (i % 5 == 0)
 {
 System.out.println(i);
 }
 i = i+1;
 }
}
}
