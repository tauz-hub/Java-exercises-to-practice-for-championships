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
Cifra da Nlog�nia
O rei da Nlog�nia ordenou que todos os documentos importantes sejam "cifrados", para que apenas quem tem conhecimento da cifra possa l�-los (cifrar um documento significa alterar o original modificando as letras de acordo com algum algoritmo de cifra).

O rei decretou que o seguinte algotimo deve ser usado para cifrar os documentos:

Cada consoante deve ser substitu�da por exatamente tr�s letras, na seguinte ordem:
a pr�pria consoante (vamos chamar de consoante original);
a vogal mais pr�xima da consoante original no alfabeto, com a regra adicional de que se a consoante original est� � mesma dist�ncia de duas vogais, ent�o a vogal mais pr�xima do in�cio do alfabeto � usada. Por exemplo, se a consoante original � d, a vogal que deve ser usada � e, pois esta � a vogal mais pr�xima; se a consoante original � c, a vogal que deve ser utilizada � a, porque c est� � mesma dist�ncia de a e e, e a � mais pr�xima do in�cio do alfabeto.
a consoante que segue a consoante original, na ordem do in�cio ao fim do alfabeto. Por exemplo, se a consoante original � d, a consoante a ser utilizada � f. No caso de a consoante original ser z, deve ser utilizada a pr�pria letra z.
As vogais n�o s�o modificadas.
Nesta tarefa, o alfabeto �
a b c d e f g h i j k l m n o p q r s t u v x z
e as vogais s�o
a e i o u
Por exemplo, a cifra da palavra "ter" � "tuveros" (tuv-e-ros) e a cifra da palavra "paz" � "poqazuz" (poq-a-zuz).

O rei da Nlog�nia procura por algu�m que saiba escrever um programa que produza a cifra de uma palavra dada. Voc� pode ajud�-lo?

Entrada
A primeira e �nica linha da entrada cont�m uma palavra P formada por letras min�sculas sem acentua��o.

Sa�da
Seu programa deve produzir uma �nica linha, contendo a palavra cifrada.

Restri��es
A palavra P tem no m�nimo uma e no m�ximo 30 letras, todas min�sculas e sem acentua��o.
*/