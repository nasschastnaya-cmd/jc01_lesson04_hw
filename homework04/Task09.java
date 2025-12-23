package jc_les05.homework;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// Дана сторона правильного четырёхугольника (квадрата). Найти его площадь,
		//диагональ и радиусы вписанной и описанной окружностей.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны квадрата (a): ");
        double side = scanner.nextDouble();

        double S = side * side; 
        
        double diagonal = side * Math.sqrt(2); 

        double inradius = side / 2.0;

       
        double outRadius = diagonal / 2.0;

        System.out.println("Площадь (S): " + S);
        System.out.println("Диагональ (d): " + diagonal);
        System.out.println("Радиус вписанной окружности (r): " + inradius);
        System.out.println("Радиус описанной окружности (R): " + outRadius);

        scanner.close();

	}

}
