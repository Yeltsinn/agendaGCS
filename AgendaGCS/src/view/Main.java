package view;

import java.util.Scanner;
import model.Contato;

public class Main {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		Scanner entrada = new Scanner (System.in);
		
		int opcao;
		String nome;
		int telefone;
		int telefone_fixo;
		String email;
		
		
		System.out.print("** AGENDA ** \n " +
				"Escolha a opção desejada: \n " +
				"1)Adicionar contato " +
				"2)Sair \n");
		
		opcao = entrada.nextInt();
		
		switch(opcao){
		
				
		}

	}

}
