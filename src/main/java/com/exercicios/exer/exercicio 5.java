package com.exercicios.exer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ExerApplication {
        public static void main(String[] args) {
		SpringApplication.run(ExerApplication.class, args);
        Scanner scanner = new Scanner(System.in);

        int comprimento;
        int largura;
        int area;
        int valorm2;

        System.out.println("Olá usuário!");
        System.out.println("Qual o comprimento do terreno? ");
        comprimento = scanner.nextInt();

        System.out.println("Qual a largura do terreno? ");
        largura = scanner.nextInt();

        area = comprimento * largura;

        System.out.println("Qual o valor do M2 na sua região? ");
        valorm2 = scanner.nextInt();

        System.out.println("O valor do terreno será de aproximadamente: " + comprimento * area + "R$");




      






	}

}
	
