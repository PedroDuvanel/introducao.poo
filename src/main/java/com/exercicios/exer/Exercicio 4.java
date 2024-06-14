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
        int sucessor;
        int antecessor;

        System.out.println("Olá, usuário!");
        System.out.println("Digite um numero para descobrir seu sucessor e antecessor: ");
        num1 = scanner.nextInt();

        sucessor = num1 + 1;
        antecessor = num1 - 1;

        System.out.println("O sucessor de" + " " + num1 + " " + "é" + " " + sucessor);

        System.out.println("O antecessor de" + " " + num1 + " " + "é" + " " + antecessor);
        






	}

}
	
