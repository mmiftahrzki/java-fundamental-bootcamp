package sesiKedua;

public class Array {
  public static void main(String[] args) {
    int[] numbers = new int[2];

    numbers[0] = 1;
    numbers[1] = 2;

    for (int number : numbers) {
      System.out.println("Print elemen di dalam array numbers: " + number);
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Print elemen di dalam array numbers: " + numbers[i]);
    }
  }
}
