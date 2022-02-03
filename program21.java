import java.util.Scanner;
public class Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		 a = ++a-b--;
		 System.out.println("Enter the number");
		
			int c = sc.nextInt();
			int d = sc.nextInt();
			c = c%d++;
			System.out.println("Enter the number");
			
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			a1*=a2+5;
System.out.println("Enter the number");
			
			int x = sc.nextInt();
			
			x=69>>>2;
		System.out.println("the number of A is :"+a);
		System.out.println("the number of C is :"+c);

		System.out.println("the number of A1 is :"+a1);
		System.out.println("the number of X is :"+x);
	}

}
