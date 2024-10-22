package sesiKedua;

import java.util.ArrayList;
import java.util.List;

public class MyList {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Kartika");
    names.add("Fajri");
    names.add("Mayra");
    names.add("Syahra");

    for (String name : names) {
      System.out.println("Nama peserta: " + name);
    }

    String tampung_nilai_dari_indeks_ke_dua = names.get(2);
    System.out.println(tampung_nilai_dari_indeks_ke_dua + "\n");

    for (int i = 0; i < names.size(); i++) {
      System.out.println("Print elemen di dalam array names: " + names.get(i));
    }
  }
}
