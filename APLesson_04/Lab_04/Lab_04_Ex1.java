import java.util.Scanner;

public class Lab_04_Ex1
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//EX_01
		Lab_04_Ex1 receipt = new Lab_04_Ex1();
		
		System.out.println("Please enter item 1");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price1 = keyboard.nextDouble();
	
		System.out.println("Please enter item 2");
		keyboard.nextLine();
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price2 = keyboard.nextDouble();
		
		System.out.println("Please enter item 3");
		keyboard.nextLine();
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price3 = keyboard.nextDouble();	
		
		double subtotal = price1 + price2 + price3;
		double tax = subtotal * 0.08;
		double total = subtotal * 1.08;
		
		System.out.println("<<<<<<<<<<<< Receipt >>>>>>>>>>>>");
		System.out.println("_________________________________");
		System.out.println("<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>");	
		receipt.format(item1, price1);		
		receipt.format(item2, price2);			
		receipt.format(item3, price3);
		System.out.println("\n");
		receipt.format("Subtotal: ", subtotal);
		receipt.format("Tax: ", tax);
		receipt.format("Total:", total);
		System.out.println("\n<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>");
		System.out.println("_________________________________");
		System.out.println("   Thank you for your service!   ");
		System.out.println("_________________________________");
		System.out.println("<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>");	
	}
	public void format(String item, double price)
	{
		System.out.printf("\n %-2s %-15s %-8s %6.2f", "* ",item, ". . . .", price);
	}
}