package jc_les05.homework;

public class Task05 {

	public static void main(String[] args) {
		// Написать программу, которая выводит на экран первые четыре степени числа e
		//(экспоненты).
		
		double step1 = Math.exp(1); 
        double step2 = Math.exp(2); 
        double step3 = Math.exp(3); 
        double step4 = Math.exp(4);

        System.out.println("e в степени 1 = " + step1);
        System.out.println("e в степени 2 = " + step2);
        System.out.println("e в степени 3 = " + step3);
        System.out.println("e в степени 4 = " + step4);
	}

}
