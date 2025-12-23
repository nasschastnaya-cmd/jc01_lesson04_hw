package jc_les05.homework;

public class Task06 {

	public static void main(String[] args) {
		// Найти сумму цифр заданного четырёхзначного числа.
		
		int num;
		
		num = 1234;
		
		int d4 = num % 10; 
		int d3 = (num / 10) % 10;
		int d2 = (num / 100) % 10;
		int d1 = num / 1000;
		int sum = d1 + d2 + d3 + d4;
		
		System.out.println("Сумма цифр числа " + num + " равна: " + sum);
	}

}
