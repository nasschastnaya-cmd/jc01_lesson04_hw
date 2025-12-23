package jc_les05.homework;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// Известен радиус шара. Найти его объем и площадь поверхности.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус шара: ");
        if (scanner.hasNextDouble()) {
            double radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Радиус не может быть отрицательным.");
            } else {
                double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                
                double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

                System.out.printf("Объем шара: %.3f\n", volume);
                System.out.printf("Площадь поверхности шара: %.3f\n", surfaceArea);
            }
        } else {
            System.out.println("Ошибка: введите числовое значение.");
        }

        scanner.close();
    }
}



