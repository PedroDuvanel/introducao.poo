package com.exercicios.exer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ExerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerApplication.class, args);
        Scanner scanner = new Scanner(System.in);
	    String nome;
		String sobrenome;
        
		System.out.println("Olá, usuário!");
		System.out.println("Qual o seu nome? ");
		nome = scanner.nextLine();
        
		System.out.println("Qual o seu sobrenome? ");
		sobrenome = scanner.nextLine();

		System.out.println("Olá," + nome + " " + sobrenome + "!");
		






	}
	


}
