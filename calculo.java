import java.util.ArrayList;
import java.util.Scanner;

public class calculo {
  public static void main(String[] args) {

    Scanner tcd = new Scanner(System.in);
    int s = tcd.nextInt();
    int a = tcd.nextInt();
    int b = tcd.nextInt();
    tcd.close();

    if (a < 1 || a > 10000 || b < 1 || b > 10000 || a > b || s < 1 || s > 36) {
      System.out.println(0);
    }

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    for (int i = a; i <= b; i++) {

      int valor = i;
      int sum = 0;
      while (valor != 0) {
        sum = sum + valor % 10;
        valor /= 10;
      }
      if (sum == s) {
        numbers.add(i);
      }

    }

    System.out.println(numbers.size());

  }

}
/*
 * Cálculo rápido
 * Algumas pessoas conseguem fazer cálculos matemáticos com uma velocidade
 * impressionante. Laurinha tem essa habilidade! Um cálculo que ela consegue
 * fazer muito rapidamente é, dados três números inteiros S, A, e B, determinar
 * quantos números do intervalo [A, B] têm a soma de seus dígitos igual a S.
 * 
 * Por exemplo, se S = 3, A = 10 e B = 30, então a reposta é 3, pois existem
 * três números no intervalo [10,30] cuja soma dos dígitos é igual a três: 12,
 * 21 e 30.
 * 
 * Sua tarefa é escrever um programa de computador para, dados os três números,
 * tentar calcular a resposta mais rapidamente do que Laurinha consegue.
 * 
 * Entrada
 * A primeira linha da entrada contém um número inteiro S, o valor da soma dos
 * dígitos. A segunda e a terceira linhas contêm respectivamente os inteiros A e
 * B.
 * 
 * Saída
 * Seu programa deve produzir uma única linha, contendo um único inteiro,
 * quantos números no intervalo dado têm a soma de dígitos indicada.
 * Restrições
 * 1 ≤ S ≤ 36
 * 1 ≤ A ≤ 10 000
 * 1 ≤ B ≤ 10 000
 * A ≤ B
 */