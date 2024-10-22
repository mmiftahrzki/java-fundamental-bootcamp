package sesiKetiga;

import java.util.Arrays;
import java.util.List;

public class methodStatic {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    boolean is_number_empty = isEmpty(numbers);

    System.out.println(is_number_empty);
  }

  public static boolean isEmpty(List<Integer> list) {
    return list.size() == 0;
  }
}
