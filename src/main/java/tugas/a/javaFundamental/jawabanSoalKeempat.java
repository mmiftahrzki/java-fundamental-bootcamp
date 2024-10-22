package tugas.a.javaFundamental;

import java.util.Arrays;
import java.util.List;

public class jawabanSoalKeempat {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<Integer> even_numbers = numbers
        .stream()
        .filter(number -> number % 2 == 0)
        .map(number -> number * 4)
        .toList();

    System.out.println("Angka genap yang dikalikan 4: " + even_numbers);
  }
}
