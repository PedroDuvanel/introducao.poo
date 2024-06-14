package com.exercicios.exer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ExerApplication {
        public static void main(String[] args) {
		SpringApplication.run(ExerApplication.class, args);
        Scanner scanner = new Scanner(System.in);

        double valor1;
        double resultado;

        System.out.println("Olá usuario!");
        System.out.println("Digite um valor para ser convertido em dolar: ");
        valor1 = scanner.nextDouble();

        resultado = valor1 / 5.25;

        System.out.println("O valor convertido será de: " + resultado + " $");





	}

}
	
