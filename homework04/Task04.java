package jc_les05.homework;

import java.util.Scanner; 

public class Task04 {

	public static void main(String[] args) {
		// Вычислить длину дуги и площадь сектора окружности с заданным радиусом R и
		//центральным углом α (в градусах)
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введите радиус (R): ");
        double r = scanner.nextDouble();

        System.out.print("Введите центральный угол в градусах (α): ");
        double alpha = scanner.nextDouble();

        double length = (Math.PI * r * alpha) / 180.0;

        double area = (Math.PI * Math.pow(r, 2) * alpha) / 360.0;
       
        System.out.printf("Длина дуги (L): %.2f\n", length);
        System.out.printf("Площадь сектора (S): %.2f\n", area);

        scanner.close();

	}

}
