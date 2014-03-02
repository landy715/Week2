import java.io.*; 
import java.util.*;
import java.text.*;

public class HW210 {

	public static void main(String[] args) {
		ArrayList<Shape> shapearray = new ArrayList<Shape>();
		Scanner input = new Scanner(System.in);
		int opt = 0;
		double k = 0, b = 0;
		Shape shapes[];
		while(true) {
			System.out.print("1)Circle 2)Oval 3)Rectangle 4)Triangle 5)print ");
			opt = input.nextInt();
			switch(opt) {
				case 1 :
					System.out.print("radius: ");
					k = input.nextDouble();
					Circle c = new Circle(k);
					shapearray.add(c);
					break;
				case 2 :
					System.out.print("ªø¶b&µu¶b: ");
					k = input.nextDouble();
					b = input.nextDouble();
					Oval o = new Oval(k, b);
					shapearray.add(o);
					break;
				case 3 :
					System.out.print("ªø&¼e: ");
					k = input.nextDouble();
					b = input.nextDouble();
					Rectangle r = new Rectangle (k, b);
					shapearray.add(r);
					break;
				case 4 :
					System.out.print("©³&°ª: ");
					k = input.nextDouble();
					b = input.nextDouble();
					Triangle t = new Triangle(k, b);
					shapearray.add(t);
					break;
				case 5 :
					for(int i=0;i<shapearray.size();i++)
					{
						shapearray.get(i).print();
					}
					return;
			}
		}

	}
}

abstract class Shape {
	abstract void print();
}

class Circle extends Shape {
	double r = 0;
	public Circle(double r) { 
		this.r = r; 
	}
	public void print() {
		System.out.println("Circle: " + 3.14 * r * r);
	}  
}

class Oval extends Shape {
	double a = 0, b = 0;
	public Oval (double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void print() {
		System.out.println("Oval: " + 3.14 * a * b);
	} 
}

class Rectangle extends Shape {
	double width = 0, height = 0;
	public Rectangle(double w, double h) { 
		this.width = w; 
		this.height = h;
	}
	public void print() {
		System.out.println("Rectangle: " + width * height);
	}  
}

class Triangle extends Shape {
	double bottom = 0, height = 0;
	public Triangle (double bottom, double height){
		this.bottom = bottom;
		this.height = height;
	}
	public void print() {
		System.out.println("Triangle: " + bottom * height / 2);
	} 

}