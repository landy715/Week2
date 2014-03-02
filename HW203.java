import java.util.Scanner;
class HW203{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System .out.println("name: ");
		String n = input.nextLine();
		System .out.println("birthday(EX:19930715): ");
		int b = input.nextInt();
		System.out.println("\n name: " + n);
		System.out.println("\n birthday: "+(b-19110000));
	
	}
}