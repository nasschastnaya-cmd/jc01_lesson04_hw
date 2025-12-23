package jc_les05.homework;

public class Task07 {

	public static void main(String[] args) {
		// Даны два числа. Найти среднее арифметическое их квадратов и среднее
		//геометрическое их модулей.

        double a = 8;
        
        
        double b = 9;

        double Sq = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;

        double Geom = Math.sqrt(Math.abs(a) * Math.abs(b));
        
        System.out.println("Среднее арифметическое квадратов: " + Sq);
        System.out.println("Среднее геометрическое модулей: " + Geom);
	}

}
