import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double tarifa = 0.625040;
		Double ilum = 11.30;
		Double bandeira = 3.01;
		//Programa pra calcular quanto vir� de energia em R$ no pr�ximo m�s
		Scanner sc = new Scanner(System.in);
		System.out.println("BEM-VINDO!");
		System.out.println();
		Integer ultKw = 13956;
		System.out.println("O valor da �ltima leitura de KWh �: " + ultKw);
		System.out.println("Digite o valor atual de KWh: ");
		Integer atualKw = sc.nextInt();
		Integer consumo = atualKw - ultKw;
		System.out.println("O consumo por enquanto � de: " + consumo + "KWh.");
		Double totalP = (consumo * tarifa) + bandeira + ilum;
		System.out.printf("Total a pagar: R$%.2f\n", totalP);
		
		sc.close();

	}

}
