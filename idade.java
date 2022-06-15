import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);

		int idade1 = tcd.nextInt();
		int idade2 = tcd.nextInt();
		int idade3 = tcd.nextInt();

		int idadeDeCamila = idade1;

		if (idade1 <= idade2 && idade1 >= idade3 || idade1 >= idade2 && idade1 <= idade3) {
			System.out.println(idade1);

		} else if(idade2 <= idade1 && idade2 >= idade3 || idade2 >= idade1 && idade2 <= idade3) {
			System.out.println(idade2);
		} else {
			System.out.println(idade3);
		}

	}
}

/*
Idade de Camila
Cibele, Camila e Celeste são três irmãs inseparáveis. Estão sempre juntas e adoram fazer esportes, ler, cozinhar, jogar no computador... Agora estão aprendendo a programar computadores para desenvolverem seus próprios jogos.

Mas nada disso interessa para esta tarefa: estamos interessados apenas nas suas idades. Sabemos que Cibele nasceu antes de Camila e Celeste nasceu depois de Camila.

Dados três números inteiros indicando as idades das irmãs, escreva um programa para determinar a idade de Camila.

Entrada
A entrada é composta por três linhas, cada linha contendo um número inteiro N, a idade de uma das irmãs.

Saída
Seu programa deve produzir uma única linha, contendo um único número inteiro, a idade de Camila.

Restrições
5 ≤ N ≤ 100
*/
