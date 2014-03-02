import java.io.*; 
import java.util.*;
import java.text.*;

public class HW209{

	public static void main(String[] args) throws IOException {
			Scanner input = new Scanner(System.in);
			int opt = 0, n = 0;
			double r[][] = new double[1][1];
			while(true) {
				System.out.print("1)new 2)search 3)BYE");
				opt = input.nextInt();
				switch(opt) {
					case 1 :
						System.out.print("數量： ");
						n = input.nextInt();
						r = new double[n][3];			
						System.out.println("編號、長軸與短軸： ");
						for(int j = 0; j < n; j++) {
							for(int i = 0; i < 3; i++) {
								r[j][i] = input.nextDouble();
							}
						}
						break;
					case 2 :
						int i = 0;
						double id = 0.0, ang = 0.0;
						Oval cir = new Oval();
						System.out.println("編號： ");
						id = input.nextDouble();
						for(i=0; i<n; i++) { 
							if(id == r[i][0]) {
								cir.r = r[i][1];
								cir.b = r[i][2];
								System.out.println("\n編號\t長軸\t短軸 \t Area ");
								System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]+"\t"+cir.Pie()+"\n");
								break;
							}
						}
						if(i == n)
							System.out.println("ERROR I can't find it!!");
						break;
					case 3 : 
						return;
				}
			}
	}

}
class Circle {
	double r = 0, an = 0;
	double Arc() {
		return 2 * 3.14 * r * an / 360;
	}
	double Pie() {
		return 3.14 * r * r;
	}
}
class Oval extends Circle{
	double b = 0;
	double Pie() {
		return 3.14 * super.r * b;
	}
}