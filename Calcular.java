/* Passo 1: Importar a classe para ler entradas*/
import java.util.Scanner;

/* Passo 2: criar o método para o menu principal (calculadora)*/

public class Calcular {

	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		
		/*boolean continuar = true;

		while (continuar){

			System.out.print("Digite um número (ou digite '0' para parar): ");
			int numero = ler.nextInt();
				
			if (numero == 0) {
				continuar = false;
			} else {}

		}*/

			double adicao, subtracao, multiplicacao, divisao;

			System.out.println("Digite a operação desejada: ");
			System.out.println("+");
			System.out.println("-");
			System.out.println("/");
			System.out.println("*");
			String operacao = ler.next();
		
			System.out.println("A opçãoo selecionada foi " + operacao); // aqui, eu ainda quero fazer aparecer o nome (em string) da op��o 

			System.out.println("Insira um número: ");
			double num1 = ler.nextDouble();

			System.out.println("Insira outro número: ");
			double num2 = ler.nextDouble();	

			adicao = 0;
			subtracao = 0;
			multiplicacao = 0;
			divisao = 0;

			if (operacao == "+"){
				
				adicao = num1 + num2;

				System.out.println("O resultado é: " + adicao);

			} else	if (operacao == "-"){
				
				subtracao = num1 - num2;

				System.out.println("O resultado é: " + subtracao);

			} else if (operacao == "/"){
				
				divisao = num1 / num2;

				System.out.println("O resultado é: " + divisao);

			} else if (operacao == "*"){
				
				multiplicacao = num1 * num2;

				System.out.println("O resultado é: " + multiplicacao);

			} else {
				System.out.println("A opção selecionada não existe");
			}
		} 	
		
}