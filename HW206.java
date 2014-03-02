import java.io.*; 
import java.util.*;

public class HW206 {
  public static void main(String args[]) throws IOException { 	
	int opt = 0, count = 0;
	String[][] Student = new String[5][3];
	String[] temp = new String[3];
	String id = "0";
	Scanner input= new Scanner(System.in);
	while(true)
	{
		System.out.println("1)new 2)search 3)BYE");
		opt=input.nextInt();
		switch(opt)
		{
			case 1 :
				System.out.println("input ID¡Bname and grade¡G (end please input 1 1 1");
				while(true)
				{
					for(int i = 0; i < 3; i++){
						temp[i] = input.next();
					}
					if(temp[0].equals("1")==true && temp[1].equals("1")==true && temp[2].equals("1")==true)
						break;
					else
					{
						for(int i = 0; i < 3; i++){
							Student[count][i]=temp[i];
						}
						count++;
					}
				}
				break;
			case 2 :
				int i=0;
				System.out.println("Input ID¡G");
				id = input.next();
				for(i=0; i<count; i++)
				{
					if(Student[i][0].equals(id)==true)
					{
						System.out.println("\n ID\t name\t grade");
						System.out.println(Student[i][0]+"\t"+Student[i][1]+"\t"+Student[i][2]+"\n");
						break;
					}
				}
				if(i == count)
					System.out.println("I can't find it!!");
				break;
			case 3 :
				return;
			default :
				continue;
		}
	}

  }
}