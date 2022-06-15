import java.util.Arrays;
import java.util.Scanner;

public class zero {
	public static void main(String[] args) {

		Scanner tcd = new Scanner(System.in);

		int numeroDeVezes = tcd.nextInt();
		
		if(numeroDeVezes > 100000) {
			numeroDeVezes = 100000;
		} else if(numeroDeVezes < 1) {
			numeroDeVezes = 1;
		}
		
		int[] numbers = new int[numeroDeVezes];
		int count = 0;
		while (count < numeroDeVezes) {
	
			int number = tcd.nextInt();
			if(number > numeroDeVezes) {
				number = numeroDeVezes;
			} else if(number < 1 && number != 0) {
				number = 0;
			} 
			
			if (number == 0 && numbers.length > 0) {

				boolean pass = true;
				int percorrer = count;
				while (pass) {
					percorrer--;

					if (percorrer < 0) {
						pass = false;
					} else {

						int num = numbers[percorrer];
						if (num != 0) {
							numbers[percorrer] = 0;
							pass = false;
						}
					}
				}

			}
			numbers[count] = number;

			
			count++;
		}

		tcd.close();
		int sum = Arrays.stream(numbers).sum();
		
		if(sum > 1000000) {
			sum = 1000000;
		} 
		System.out.println(sum);

	}
}
/*
Zero para cancelar
Seu chefe está ao telefone, nervoso. Ele quer que você compute a soma de uma sequência de números que ele vai falar para você ao telefone, para saber o total das vendas em sua mais recente viagem de negócios.

Infelizmente, de vez em quando seu chefe fala números errados para você ao telefone.

Felizmente, seu chefe rapidamente percebe que falou um número errado e diz "zero", que como combinado previamente quer dizer ignore o último número corrente.

Infelizmente, seu chefe pode cometer erros repetidos, e diz "zero" para cada erro.

Por exemplo, seu chefe pode falar ao telefone "Um, três, cinco, quatro, zero, zero, sete, zero, zero, seis", o que significa uma soma total igual a 7, conforme explicado na tabela abaixo:

Fala do chefe	Números correntes	Explicação
"um, três, cinco, quatro"	1,3,5,4	registre os quatro números
"zero, zero"	1, 3	ignore os dois últimos números
"sete"	1, 3, 7	registre o sete ao final da lista
"zero, zero"	1	ignore os dois últimos números
"seis"	1, 6	registre seis ao final da lista
Para não deixar seu chefe ainda mais nervoso, escreva um programa que determine a soma total dos números falados por seu chefe ao telefone.

Entrada
A primeira linha da entrada contém um inteiro N, a quantidade de números inteiros (incluindo os "zeros") que o seu chefe falou ao telefone. Cada uma das N linhas seguintes contém um número inteiro Xi.

Saída
Seu programa deve produzir uma única linha na saída, contendo um único inteiro, a soma correta dos números, levando em conta que o valor 0 significa erro, conforme descrito.

Restrições
1 ≤ N ≤ 100 000
0 ≤ Xi ≤ 100, para (1 ≤ i ≤ N)
0 ≤ resultado ≤ 1 000 000

*/