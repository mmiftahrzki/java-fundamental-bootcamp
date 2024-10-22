package sesiKetiga;

public class methodNonStatic {
  public static void main(String[] args) {
    methodNonStatic objectClassMethodNonStatic = new methodNonStatic();
    objectClassMethodNonStatic.checkNumber();
  }

  public void checkNumber() {
    int number = 10;

    if (number < 10) {
      System.out.println("Nilai dari variabel number lebih kecil dari 10");
    } else {
      System.out.println("Nilai dari variabel number tidak lebih kecil dari 10");
    }
  }
}
