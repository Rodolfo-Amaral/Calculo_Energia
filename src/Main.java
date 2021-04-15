import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Double tarifa = 0.625040;
		Double ilum = 11.30;
		Double bandeira = 3.01;
		
		//Programa pra calcular quanto vir� de energia em R$ no pr�ximo m�s
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		System.out.println("BEM-VINDO!");
		System.out.println();
		Integer ultKw = 13956;
		Double totUlt = 123.65;
		System.out.println("O valor da �ltima leitura de KWh �: " + ultKw + " e voc� pagou R$" + totUlt);
		System.out.println("Digite o valor atual de KWh: ");
		Integer atualKw = sc.nextInt();
		System.out.println("Qual a data da leitura atual: ");
		Date data = sdf.parse(sc.next());
		Date dataAtual = new Date(System.currentTimeMillis());
		
			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			int diaLeitura = cal.get(Calendar.DAY_OF_MONTH);
			cal.setTime(dataAtual);
			int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
			int dataConsumo = diaAtual - diaLeitura;
			cal.setTime(dataAtual);
			cal.add(Calendar.MONTH, 1);//pega a data atual do sistema e soma +1 mes
			Date dataProxLeitura = cal.getTime();
			cal.setTime(dataProxLeitura);
			
		Integer consumo = atualKw - ultKw;
		System.out.println("O consumo atual � de: " + consumo + "KWh.");
		Double totalP = (consumo * tarifa) + bandeira + ilum;
		
		System.out.printf("Total a pagar: R$%.2f\n", totalP);
		if (totalP < totUlt) {
			double econ = totUlt - totalP;
			System.out.printf("Voc� economizou: R$%.2f! :D\n", econ);
		}
		else {
			double gasto = totalP - totUlt;
			System.out.printf("A conta aumentou R$%.2f em rela��o ao m�s passado.\n", gasto );
		}
		int mediaC = consumo / dataConsumo;
		System.out.println("A m�dia de consumo di�ria � de: " + mediaC + "KWh");
		//System.out.println("Se manter essa m�dia at� o dia: " + sdf.format(dataProxLeitura) + " voc� consumir�: " +  + "KWh");
		
		sc.close();

	}

}
