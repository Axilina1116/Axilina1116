
import java.util.Scanner;
public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the radius");
double r = sc.nextDouble();
System.out.println("enter the height");
double h = sc.nextDouble();
sc.nextLine();
float pi = 3.14f;
double area = 2 * pi * r * r + 2 * pi * r * h;
System.out.println("area of cylinder" +area);
	}

}
