package programa;

import java.util.Scanner;

public class RefeicaoViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int frango, bife, massa, clienteFrango, clienteBife, clienteMassa, clienteSemFrango, clienteSemBife, clienteSemMassa, clienteComFome;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite qual a quantidade de pratos disponíveis:");
		System.out.print("Frango: ");
		frango = sc.nextInt();
		System.out.print("Bife: ");
		bife = sc.nextInt();
		System.out.print("Massa: ");
		massa = sc.nextInt();
		
		System.out.println("Digite qual a quantidade de clientes que desejam comer cada prato:");
		System.out.print("Clientes que desejam comer frango: ");
		clienteFrango = sc.nextInt();
		System.out.print("Clientes que desejam comer bife: ");
		clienteBife = sc.nextInt();
		System.out.print("Clientes que desejam comer massa: ");
		clienteMassa = sc.nextInt();
		
		if (frango < clienteFrango) {
			clienteSemFrango = clienteFrango - frango;
		}
		else {
			clienteSemFrango = 0;
		}
		
		if (bife < clienteBife) {
			clienteSemBife = clienteBife - bife;
		}
		else {
			clienteSemBife = 0;
		}
		
		if (massa < clienteMassa) {
			clienteSemMassa = clienteMassa - massa;
		}
		else {
			clienteSemMassa = 0;
		}
		
		clienteComFome = clienteSemFrango + clienteSemBife + clienteSemMassa;
		
		System.out.printf("O número de clientes que não irão comer é de %d", clienteComFome);
		
		sc.close();
	}

}
