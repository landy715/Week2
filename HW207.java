import java.io.*; 
import java.util.*;

public class HW207 {

	public static void main (String[] args) throws IOException {
		int opt = 0, n = 0;
		Scanner input = new Scanner(System.in);
		double r[][] = new double[1][1];
		while(true) {
			System.out.print("1)new 2)search 3)BYE");
			opt = input.nextInt();
			switch(opt) {
				case 1 :
					System.out.print("�ƶq�G ");
					n = input.nextInt();
					r = new double[n][2];				
					System.out.println("�s���P�b�|�G ");
					for(int j = 0; j < n; j++) {
						for(int i = 0; i < 2; i++) {
							r[j][i] = input.nextDouble();
						}
					}
						break;
				case 2 :
					int i = 0;
					double id = 0.0, ang = 0.0;
					Circle c = new Circle();
					System.out.println("�s���P���סG ");
					id = input.nextDouble();
					ang = input.nextDouble();
					for(i=0; i<n; i++) { //���æL�X
						if(id == r[i][0]) {
							c.radius = r[i][1];
							c.angle = ang;
							System.out.println("\n�s��\t�b�|\t����\t���n ");
							System.out.println(r[i][0]+"\t"+r[i][1]+"\t"+c.Arc()+"\t"+c.Pie()+"\n");
							break;
						}
					}
					if(i == n)
						System.out.println("�䤣����!!");
					break;
				case 3 :
					return;
			}
		}

	}

}

class Circle {
	double radius = 0.0, angle = 0.0;

	double Arc() { 
		return 2 * 3.14 * radius * angle/360;
	}
	double Pie() {
		return 3.14 * radius * radius;
	}
}