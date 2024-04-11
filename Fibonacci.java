package condicional;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do limite:");
		int limite = sc.nextInt();
		int valor1=0;
		int valor2=1;
		int cont, res;
		System.out.println(valor2);
				for (cont= 2; cont <= limite; cont++) {
					res= valor1 + valor2;
					System.out.println(res);
					valor1 = valor2;
					valor2 = res;
				}

	}

}
