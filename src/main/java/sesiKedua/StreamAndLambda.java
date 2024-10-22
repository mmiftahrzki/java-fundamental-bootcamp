package sesiKedua;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndLambda {
  public static void main(String[] args) {
    List<Integer> huruf = Arrays.asList(170, 165, 160, 155, 150);

    if (huruf.size() < 6) {

    }

    // JAVA STREAM
    List<Integer> huruf_baru = huruf.stream().filter(a -> a >= 160).collect(Collectors.toList());
    for (Integer hb : huruf_baru) {
      System.out.println(hb);
    }
  }
}
