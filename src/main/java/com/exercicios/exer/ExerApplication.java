package com.exercicios.exer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ExerApplication {
        public static void main(String[] args) {
		SpringApplication.run(ExerApplication.class, args);

        Scanner scanner = new Scanner(System.in);
      
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int media;

        System.out.println("Digite uma nota: ");
        nota1 = scanner.nextInt();

        System.out.println("Digite uma nota: ");
        nota2 = scanner.nextInt();
        
        System.out.println("Digite uma nota: ");
        nota3 = scanner.nextInt();
        
        System.out.println("Digite uma nota: ");
        nota4 = scanner.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média entre essas quatro notas será: " + media);

        

	 }


}
	
