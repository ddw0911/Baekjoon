import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5543 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] menu = new int[5];

    int minBurger = 2000;
    int minSoda = 2000;

    for (int i = 0; i < 5; i++) {
      menu[i] = Integer.parseInt(br.readLine());
      if (i < 3) {
        minBurger = Math.min(minBurger, menu[i]);
      } else {
        minSoda = Math.min(minSoda, menu[i]);
      }
    }
    System.out.print(minBurger + minSoda - 50);
  }
}
