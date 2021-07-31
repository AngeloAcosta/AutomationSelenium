package com.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplicacion {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		
		int total = num1*num2*num3;
		
		System.out.println("La multiplicación de los números es: " + total);
		
		//Scanner
		try {
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("Ingresa 1 número entero");
			int readNum1 = myObj.nextInt();
			System.out.println("Ingresa 2 número entero");
			int readNum2 = myObj.nextInt();
			System.out.println("Ingresa 3 número entero");
			int readNum3 = myObj.nextInt();
			
			int totalScanner = readNum1*readNum2*readNum3;
			
			System.out.println("La multiplicación de los números es: " + totalScanner);
		} catch (InputMismatchException e) {
			System.out.println("¡Error! vuelve a ejecutar el programa y escribe sólo números enteros por favor");
		}
		
	}

}
