/* Passo 1: Importar a classe para ler entradas*/
import java.util.Scanner;

/* Passo 2: criar o m�todo para o menu principal (calculadora)*/

public class Calcular {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		num1 = in.nextInt();

		System.out.prinln("Insira outro n�mero: ");
		num2 = in.nextInt();		

		System.ou.println("Digite a opera��o desejada: ");
		System.out.println("+");
		System.out.println("-");
		System.out.println("/");
		System.out.println("*");
		String operacao = in.nextInt();
		
		System.out.println("A op��o selecionada foi " + "'"opera��o"'"); // aqui, eu ainda quero fazer aparecer o nome (em string) da op��o 

		while (operacao !=1 && operacao =!2 && operacao =! 3 && operacao != 4){
			if (operacao == 1){
			
			} 
		} System.out.println("Op��o inexistente")
	}
}
