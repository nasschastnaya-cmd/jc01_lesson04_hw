package jc_les05.homework;

import java.util.Scanner; 


public class Task08 {

	public static void main(String[] args) {
		// Дана длина стороны правильного шестигранника. Найти его периметр, площадь и
		//объём правильной призмы на его основе с заданной высотой.
		Scanner input = new Scanner(System.in);

        System.out.print("Введите длину стороны основания (a): ");
        double a = input.nextDouble();

        System.out.print("Введите высоту призмы (h): ");
        double h = input.nextDouble();

      
        double perimeter = 6 * a;
        
        double baseArea = (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;

        double volume = baseArea * h;
        
        System.out.printf("Периметр основания: %.2f\n", perimeter);
        System.out.printf("Площадь основания: %.2f\n", baseArea);
        System.out.printf("Объём призмы: %.2f\n", volume);

        input.close();
    }
}
