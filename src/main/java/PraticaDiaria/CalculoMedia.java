package PraticaDiaria;

import java.util.Scanner;

public class CalculoMedia{
    public static void main(String[]args){
        Scanner var = new Scanner (System.in);
        
        String nome;
        double v1,v2,v3,v4,media;
        
        System.out.println("Qual seu nome?");
        nome = var.nextLine();
        
        System.out.println("Primeiro valor:");
        v1 = var.nextDouble();
        
        System.out.println("Segundo valor:");
        v2 = var.nextDouble();
        
        System.out.println("Terceiro valor:");
        v3 = var.nextDouble();
        
        System.out.println("Quarto valor:");
        v4 = var.nextDouble();
        
        media = (v1+v2+v3+v4)/4;
        
        if ( media >= 7){
            System.out.println(nome + " sua nota é " + media  + " então você está Aprovado!!");
        } else{
            System.out.println(nome + " sua nota é " + media  + " por isso você está Reprovado!");
        }
        
        
    }
    
}