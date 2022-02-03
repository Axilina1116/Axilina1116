import java.util.Scanner;
public class Eva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int a = sc.nextInt();
a+=a++ + ++a + -a + a;
System.out.println("Enter the number");
int x = sc.nextInt();
x = x++ *2 + 3 * -x;

System.out.println("the value of a is  : " +a);
System.out.println("the value of x is : " +x);

	}

	
}
