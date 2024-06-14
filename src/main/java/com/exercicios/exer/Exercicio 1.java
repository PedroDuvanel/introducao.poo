package com.exercicios.exer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ExerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerApplication.class, args);
        Scanner scanner = new Scanner(System.in);
	    int num1;
		int num2;
        int resultado;

		System.out.println("Digite um número: ");
		num1 = scanner.nextInt();

		System.out.println("Digite um número: ");
		num2 = scanner.nextInt();

        resultado = num1 + num2;

		System.out.println("Este é o resultado: " + resultado);


	}
	


}
