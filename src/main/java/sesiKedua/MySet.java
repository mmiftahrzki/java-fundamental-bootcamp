package sesiKedua;

import java.util.HashSet;
import java.util.Set;

public class MySet {
  public static void main(String[] args) {
    Set<String> huruf = new HashSet<>();

    huruf.add("A");
    huruf.add("A");
    huruf.add("B");
    huruf.add("C");
    huruf.add("D");

    System.out.println(huruf.size());

    for (String h : huruf) {
      System.out.println(h);
    }
  }
}
