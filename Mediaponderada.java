package logica;

import java.util.Scanner;

public class Mediaponderada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, n4;
		Scanner sc = new Scanner(System.in);
		//scanner é o construtor sc é o objeto e new é criar
		
		System.out.println("Informe o valor de n1");
		n1 = sc.nextFloat();
		
		System.out.println("Informe o valor de n2");
		n2 = sc.nextFloat();
		
		System.out.println("Informe o valor de n3");
		n3 = sc.nextFloat();
		
		System.out.println("Informe o valor de n4");
		n4 = sc.nextFloat();
		
		float media = (n1*2+n2*2+n3*3+n4*3)/10;
		
		System.out.printf("A média de %f, %f, %f e %f é %.2f", n1, n2, n3, n4, media);
		
		sc.close();

	}

}
