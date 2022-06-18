import java.util.ArrayList;
import java.util.Scanner;

public class media {
  public static void main(String[] args) {
    Scanner tcd = new Scanner(System.in);
    String entrada = tcd.nextLine();
    String[] numbersString = entrada.split(" ");

    ArrayList<Integer> nums = new ArrayList<Integer>();

    for (String item : numbersString) {
      int num = Integer.parseInt(item);
      nums.add(num);

    }

    int interval = nums.get(1) - nums.get(0);

    int newNumber = nums.get(0) - interval;

    System.out.println(newNumber);

  }
}
/*
Média ou mediana
A média de três números inteiros A, B e C é (A + B + C)/3. A mediana de três números inteiros é o número que ficaria no meio se os três números fossem ordenados em ordem não-decrescente.

Sua tarefa é escrever um programa que, dados dois números inteiros distintos A e B, calcule o menor inteiro possível C tal que a média e a mediana de A, B e C sejam iguais.

Entrada
A entrada é composta de uma única linha contendo dois números inteiros A e B.

Saída
Seu programa deve produzir uma única linha, contendo um único número, o menor inteiro possível C tal que a média e a mediana de A, B e C são iguais.

Restrições
1 ≤ A ≤ B ≤ 109
*/
