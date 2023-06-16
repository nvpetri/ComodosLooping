package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    String nome, nomeFinal, sim;
	    double largura, comprimento, areaComodo;
	    double areaCasa = 0.0;

	    for (sim = "s"; sim.equals("s");) {
	    	System.out.println("-------------------------");
	        System.out.print("Qual o nome do cômodo? ");
	        nome = teclado.next();
	        System.out.println("-------------------------");
	        
	        System.out.print("Qual a largura do " + nome + " em metros? ");
	        largura = teclado.nextDouble();
	        System.out.println();

	        System.out.print("Qual o comprimento do " + nome + " em metros? ");
	        comprimento = teclado.nextDouble();
	        System.out.println();

	        areaComodo = comprimento * largura;

	        System.out.println("A área do " + nome + " é de " + areaComodo + " m2");

	        System.out.println("Deseja medir outro cômodo (S/N)");
	        sim = teclado.next();

	        areaCasa += areaComodo;
	        
	        
	    }

	    System.out.println("A área da casa é de " + areaCasa + " m2");
	}
}