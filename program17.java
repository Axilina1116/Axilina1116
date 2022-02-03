import java.util.Scanner;
public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 , n2;
		boolean  b = true;
		Scanner sc =  new Scanner(System.in);
		System.out.println("print the number");
		n1 = sc.nextInt();
		sc.nextLine();
		System.out.println("print the number");
		n2 = sc.nextInt();
		n2 = -n2;
		sc.nextLine();
		System.out.println("print the numbers n1 and n2");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("print the unary plus: " +n1);
System.out.println("print the unary minus: " +n2);
System.out.println("!(n1<n2):"+b);

System.out.println("!(n1>n2):"+b);
	}

}
