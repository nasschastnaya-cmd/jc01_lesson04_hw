package jc_les05.homework;

public class Task02 {

	public static void main(String[] args) {
		// Вычислить расстояние между центрами двух окружностей с заданными
		//координатами их центров (x1,y1) и (x2,y2).
		
		double x1 = 3;
		double x2 = 6;
		double y1 = 5;
		double y2 = 8;
		
		double h;
		
		h = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		System.out.println("Pасстояние между центрами двух окружностей = " + h);
	}

}
