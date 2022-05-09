package ru.stqa.pft.sandbox;

public class MyFirst
{
	public static void main(String[] args) {
		hello("world");
		hello("user");

		double len = 5;
		System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

		double a = 5;
		double b = 5;
		System.out.println("Площадь прямоугольника со стороной " + area(a, b));

	}
	public static void hello(String somebody){
		System.out.println("Hello " + somebody + "!");
	}
	public static double area (double l) {
		return l * l;
	}
	public static double area (double a, double b) {
		 return a * b;
	}
}
