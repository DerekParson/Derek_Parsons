import java.util.Scanner;
public class APLab_04_3_Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter radius");
		double r = kb.nextDouble();
		print(r, calcArea(r));
	}
	public static double calcArea(double r)
	{
		return 3.14 * r * r;
	}
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of %.5f is %.5f", r, area);
	}
}
