import java.util.Scanner;
class HW204{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double num1=0,num2=0,sum=0;
		int opt=0;
		System .out.println("number1: ");
		num1=input.nextDouble();
		do{
			System .out.println("number2: ");
			num2=input.nextDouble();
			if(num2==0)
			{
				System.out.println("ERROR\n");
			}
		}while(num2==0);
		do
		{
			System.out.print("1) + 2) - 3) * 4) /  5) bye ?\n");
			opt=input.nextInt();				
		}while(opt==5);
		switch(opt)
		{
			case 1:
				sum=num1+num2;
				break;
			case 2:
				sum=num1-num2;
				break;
			case 3:
				sum=num1*num2;
				break;
			case 4:
				sum=num1/num2;
				break;		
			case 5:
				break;
			default:
				System.out.print("Error!\n");
				break;
		}
		System.out.print("\n result:"+sum);
	}
}