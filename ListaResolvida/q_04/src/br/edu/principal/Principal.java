package br.edu.principal;
import java.util.Scanner;


public class Principal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
System.out.println("Digite o seu sal�rio atual: ");

float sal = sc.nextFloat();

double novosal = (sal*1.25); //1.25 = 100% + 25%

System.out.println("Com o aumento de 25%, o seu sal�rio passa a ser " +novosal+ " reais");
}
}
