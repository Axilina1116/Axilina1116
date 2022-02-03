import java.util.Scanner;
public class Evaluate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		
		sc.nextLine();
		x = ++x - x++ + -x;
		System.out.println("the value of x1 is : " +x);
	}

}
