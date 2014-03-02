import java.io.*; 
import java.util.*;
import java.text.*;

public class HW208 {

	public static void main(String[] args) {
		String date;
		TestDate test = new TestDate();
		Scanner input = new Scanner(System.in);
		System.out.print("DATE�G ");
		date = input.next();
		test.Test(date);
	}

}
class TestDate {
	int[] len = new int[]{0, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int i = 0, d = 0;
	void Test(String w) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
		try {
             dateFormat.parse(w);
         }
        catch (Exception e) {
        	System.out.println("ERROR�I(yyyy/MM/dd)");
        	return;
        }
		String[] ymd = w.split("/");
		int year = Integer.valueOf(ymd[0]);
		int month = Integer.valueOf(ymd[1]);
		int day = Integer.valueOf(ymd[2]);
		if(year > 0 && month > 0 && month <= 12)
		{
			if(month==2) { 
				if(year%400==0 || (year%4==0 && year%100!=0))
				{
					System.out.println("�|�~�I(2��29��)");
					d=30;
				}
				else {
					System.out.println("���~�I(2��28��)");
					d=29;
				}
				if(day < d && day > 0)
					print(w);
				else
					System.out.println("ERROR�I");
				return;

			}else if(len[month] > day && day > 0) {
				print(w);
			}else
				System.out.println("Error�I");

		}
		else
			System.out.println("������b�X�z�d��I");
		return;
	}
	void print(String w) {
		System.out.print("ERROR�I\n �A��J�G "+w);
	}
}