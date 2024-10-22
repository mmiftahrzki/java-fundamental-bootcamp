package sesiPertama;

public class ConditionalStatements {
  public static void main(String[] args) {
    int nominal = 1000;

    if (nominal == 8000) {
      System.out.println("Beli snack A");
    } else if (nominal == 10000) {
      System.out.println("Beli snack B");
    } else {
      System.out.println("Tidak usah jajan");
    }

    switch (nominal) {
      case 8000:
        System.out.println("Beli snack A");
        break;
      case 1000:
        System.out.println("Beli snack B");
        break;
      default:
        System.out.println("Tidak usah jajan");
    }

    jawabanSoalKedua();
  }

  public static void jawabanSoalKedua() {
    int[] numbers = {2, 6, 9, 4, 3};

    int length_of_numbers = numbers.length;

    for (int i = 0; i <= length_of_numbers; i++) {
      if (numbers[i] == 4) {
        break;
      }

      System.out.println("Output: " + numbers[i]);
    }
  }
}
