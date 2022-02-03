import java.util.Scanner;
public class ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
Scanner sc = new Scanner(System.in);
System.out.println("print the number");
int a = sc.nextInt();
int b = sc.nextInt();
marks = (a>b)?a:b;
System.out.println("print the marks:" +marks);
	}

}
