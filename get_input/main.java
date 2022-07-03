import java.util.Scanner;
public class main{
public static void main(String[] argv){
System.out.println("Enter your name:");
Scanner input = new Scanner(System.in);
String name = input.nextLine();
System.out.print("Hello, "+name);
System.out.print(input.nextLine());
System.out.println("Bye");
}
}
