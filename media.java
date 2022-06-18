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
