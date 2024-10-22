package sesiKedua;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
  public static void main(String[] args) {
    Map<Integer, String> data_saya = new HashMap<>();

    data_saya.put(1, "Muhammad");
    data_saya.put(2, "Miftah");
    data_saya.put(3, "Rizki");

    for (Integer k: data_saya.keySet()){
      System.out.println("Key: " + k + " valuenya adalah: " + data_saya.get(k));
    }

    for (Map.Entry<Integer, String> entry : data_saya.entrySet()){
      System.out.println("Key: " + entry.getKey() + " valuenya adalah: " + entry.getValue());
    }

    data_saya.forEach((k, v) -> {
      System.out.println("Key: " + k + " valuenya adalah: " + v);
    });
  }
}
