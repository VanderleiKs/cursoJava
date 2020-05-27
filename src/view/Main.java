package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sue Nome: ");
		String nome = scan.nextLine();
		
		System.out.println(nome);
		
		
		
		scan.close();
	}

}
