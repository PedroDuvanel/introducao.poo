package com.exercicios.exer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ExerApplication {
        public static void main(String[] args) {
		SpringApplication.run(ExerApplication.class, args);
        Scanner scanner = new Scanner(System.in);

        int distanciaPercorrida;
        int custoCombustivel;
        final double VALOR_DO_COMBUSTIVEL = 5.25;

        System.out.println("Qual a distancia percorrida? ");
        distanciaPercorrida = scanner.nextInt();

        System.out.println("Qual o custo do combustivel? ");
        custoCombustivel = (int) scanner.nextDouble();

        double autonomia = distanciaPercorrida / (custoCombustivel / VALOR_DO_COMBUSTIVEL);



        System.out.println("A sua autonomia foi de " + autonomia + "km/h");

	}

}
	
