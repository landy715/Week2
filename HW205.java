import java.util.Scanner;

public class HW205 {
  public static void main(String args[]) { 	
	int year = 0, count = 1;
	System.out.println("year(EX:1993)"); 
	Scanner input = new Scanner(System.in);
	year = input.nextInt();
	System.out.println("¶|¦~¡G");
	for(int i=year; i>0; i--)
	{
		if(i%400==0 || (i%4==0 && i%100!=0))
		{
			System.out.print(i+"\t");
			if(count%12==0)
				System.out.print("\n");
			count++;
		}	
	}
  }
}