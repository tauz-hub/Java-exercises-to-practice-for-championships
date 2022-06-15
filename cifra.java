import java.util.Scanner;

public class cifra {
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);

		String palavra = tcd.next();
		tcd.close();
		String alfabetoString = "a b c d e f g h i j k l m n o p q r s t u v x z";

		String alfabeto = alfabetoString.replace(" ", "");
		String[] palavraSplit = palavra.split("");
		
		String palavraCifrada = "";

		for (int i = 0; i < palavraSplit.length; i++) {
			String letra = palavraSplit[i];
			String letraCifrada = letra;

			int posicaoDaLetra = alfabeto.indexOf(letra);

			String vogais = "a e i o u";

			if (!vogais.contains(letra)) {

				String[] listaVogais = vogais.split(" ");

				int menorDistancia = 26;
				String melhorVogal = "";
				for (int j = 0; j < listaVogais.length; j++) {
					String vogal = listaVogais[j];

					int posicaoVogal = alfabeto.indexOf(vogal);

					int distanciaEntreLetraEVogal = posicaoDaLetra - posicaoVogal;
					if (distanciaEntreLetraEVogal < 0) {
						distanciaEntreLetraEVogal = distanciaEntreLetraEVogal * -1;
					}

					if (menorDistancia > distanciaEntreLetraEVogal) {
						menorDistancia = distanciaEntreLetraEVogal;
						melhorVogal = vogal;
					} else if (menorDistancia == distanciaEntreLetraEVogal) {
						int posicaoPrimeiraVogal = alfabeto.indexOf(melhorVogal);
						int posicaoSegundaVogal = alfabeto.indexOf(vogal);
						if (posicaoPrimeiraVogal > posicaoSegundaVogal) {
							menorDistancia = distanciaEntreLetraEVogal;
							melhorVogal = vogal;
						}
					}

				}

				letraCifrada += melhorVogal;

				char letraSucessor;
				if ((posicaoDaLetra + 1) >= 24) {
					letraSucessor = 'z';
				} else {
					letraSucessor = alfabeto.charAt(posicaoDaLetra + 1);
				}

				if (letraSucessor == 'a' || letraSucessor == 'e' || letraSucessor == 'i' || letraSucessor == 'o'
						|| letraSucessor == 'u') {
					letraSucessor = alfabeto.charAt(alfabeto.indexOf(letraSucessor) + 1);

				}

				letraCifrada += letraSucessor;
			}

			palavraCifrada += letraCifrada;
		}
		System.out.println(palavraCifrada);
	}
}
/*
Cifra da Nlogônia
O rei da Nlogônia ordenou que todos os documentos importantes sejam "cifrados", para que apenas quem tem conhecimento da cifra possa lê-los (cifrar um documento significa alterar o original modificando as letras de acordo com algum algoritmo de cifra).

O rei decretou que o seguinte algotimo deve ser usado para cifrar os documentos:

Cada consoante deve ser substituída por exatamente três letras, na seguinte ordem:
a própria consoante (vamos chamar de consoante original);
a vogal mais próxima da consoante original no alfabeto, com a regra adicional de que se a consoante original está à mesma distância de duas vogais, então a vogal mais próxima do início do alfabeto é usada. Por exemplo, se a consoante original é d, a vogal que deve ser usada é e, pois esta é a vogal mais próxima; se a consoante original é c, a vogal que deve ser utilizada é a, porque c está à mesma distância de a e e, e a é mais próxima do início do alfabeto.
a consoante que segue a consoante original, na ordem do início ao fim do alfabeto. Por exemplo, se a consoante original é d, a consoante a ser utilizada é f. No caso de a consoante original ser z, deve ser utilizada a própria letra z.
As vogais não são modificadas.
Nesta tarefa, o alfabeto é
a b c d e f g h i j k l m n o p q r s t u v x z
e as vogais são
a e i o u
Por exemplo, a cifra da palavra "ter" é "tuveros" (tuv-e-ros) e a cifra da palavra "paz" é "poqazuz" (poq-a-zuz).

O rei da Nlogônia procura por alguém que saiba escrever um programa que produza a cifra de uma palavra dada. Você pode ajudá-lo?

Entrada
A primeira e única linha da entrada contém uma palavra P formada por letras minúsculas sem acentuação.

Saída
Seu programa deve produzir uma única linha, contendo a palavra cifrada.

Restrições
A palavra P tem no mínimo uma e no máximo 30 letras, todas minúsculas e sem acentuação.
*/