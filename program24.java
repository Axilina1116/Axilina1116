import java.util.Scanner;
public class ValueOfZ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int y = sc.nextInt();
		int z = (++y * (y++ + 5));
		System.out.println("the value of z is : " +z);
}
}