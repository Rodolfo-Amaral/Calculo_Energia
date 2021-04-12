import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double tarifa = 0.625040;
		Double ilum = 11.30;
		Double bandeira = 3.01;
		//Programa pra calcular quanto virá de energia em R$ no próximo mês
		Scanner sc = new Scanner(System.in);
		System.out.println("BEM-VINDO!");
		System.out.println();
		Integer ultKw = 13956;
		System.out.println("O valor da última leitura de KWh é: " + ultKw);
		System.out.println("Digite o valor atual de KWh: ");
		Integer atualKw = sc.nextInt();
		Integer consumo = atualKw - ultKw;
		System.out.println("O consumo por enquanto é de: " + consumo + "KWh.");
		Double totalP = (consumo * tarifa) + bandeira + ilum;
		System.out.printf("Total a pagar: R$%.2f\n", totalP);
		
		sc.close();

	}

}
