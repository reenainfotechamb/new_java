import java.util.Scanner;
public class main{
public static void main(String[] argv){
Scanner inp_a = new Scanner(System.in);
Scanner inp_b = new Scanner(System.in);

//now make the calulator
System.out.println("Welcome is Aryan Caluctor");
System.out.print("Enter your first  number:");
int num_a = inp_a.nextInt();
System.out.println(" ");
System.out.print("ENter your secound number:");
int num_b = inp_a.nextInt();

//add  to input
int add_r = num_a + num_b;
//subtract
int sub_r = num_a - num_b;
//multiply
int mult_r = num_a* num_b;
//divide
int div_r = num_a/num_b;
System.out.println("The Result are below :");
System.out.println("Sum  : "+add_r);
System.out.println("Subtract :"+sub_r);
System.out.println("Multiply : "+mult_r);
System.out.println("DIvide :"+div_r);
System.out.println("Thanks for using us");

}
}
