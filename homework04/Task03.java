package jc_les05.homework;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Даны координаты трёх вершин прямоугольного треугольника (x1,y1), (x2,y2), (x3,y3).
		//Найти длины его катетов и гипотенузы.
		
		Scanner scanner = new Scanner(System.in);

       
        System.out.println("Введите x1, y1:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Введите x2, y2:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Введите x3, y3:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double s2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double s3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        
        double hypotenuse, leg1, leg2;
        
        if (s1 > s2 && s1 > s3) {
            hypotenuse = s1;
            leg1 = s2;
            leg2 = s3;
        } else if (s2 > s1 && s2 > s3) {
            hypotenuse = s2;
            leg1 = s1;
            leg2 = s3;
        } else {
            hypotenuse = s3;
            leg1 = s1;
            leg2 = s2;
        }
            System.out.println("Гипотенуза: " + hypotenuse);
            System.out.println("Катет 1: " + leg1);
            System.out.println("Катет 2: " + leg2);
            
            scanner.close();
        }
	}

