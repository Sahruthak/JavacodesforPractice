/*
Area Of Circle Java Program
Area Of Triangle
Area Of Rectangle Program
Area Of Isosceles Triangle
Area Of Parallelogram
Area Of Rhombus
Area Of Equilateral Triangle
Perimeter Of Circle
Perimeter Of Equilateral Triangle
Perimeter Of Parallelogram
*/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Radius");
	    double r=sc.nextDouble();
	    System.out.println("area of circle "+(Math.PI*r*r));
	    System.out.println("Length");
	    int l=sc.nextInt();
	    System.out.println("Breadth");
	    int b=sc.nextInt();
	    System.out.println("Base");
	    int bs=sc.nextInt();
	    System.out.println("Triangle "+(0.5*l*b));
		System.out.println("Rectangle "+(l*b));
		System.out.println("Isosceles triangle "+(0.5*l*b));
		System.out.println("Parallelogram"+(l*bs));
		System.out.println("Diagonal 1");
	    int d1=sc.nextInt();
	    System.out.println("Diagonal 2");
	    int d2=sc.nextInt();
		System.out.println("Rhombus "+(d1*d2));
		System.out.println("Equilateral triangle "+(0.5*l*b));
		System.out.println("perimeter of circle "+(Math.PI*r*r));
		System.out.println("perimetre of Equilateral triangle "+(3*l));
		System.out.println("perimetre of Parallelogram "+(2*(bs+l)));
	}
}
