import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year : ");

int year = sc.nextInt();
if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
{
	System.out.println("it is a leap year");
}
else
{
	System.out.println("it is not a leap year");
	
}
	}

}
