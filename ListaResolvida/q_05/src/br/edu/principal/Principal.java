package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Esse programa mostrar� o valor do seu sal�rio ap�s o aumento sofrido pelo mesmo. \n");
		
		double sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu sal�rio atual: ");
		sal = sc.nextDouble();
		
		double perc;
		Scanner pc = new Scanner(System.in);
		System.out.println("Digite o valor do aumento da porcentagem do sal�rio: ");
		perc = pc.nextDouble();
		
		double novosal;
		novosal = sal * ((100+perc)/100);
		System.out.println("O novo valor do sal�rio � de: " +novosal+ " reais");
		
	}
}
