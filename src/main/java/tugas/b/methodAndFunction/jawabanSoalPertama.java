package tugas.b.methodAndFunction;

public class jawabanSoalPertama {
  private static final String NAME = "YOUR NAME";

  public static void main(String[] args) {
    String my_name = printMyName(null);
    System.out.println("Output: " + my_name);
  }

  private static String printMyName(String name) {
    if (name == null || name.isEmpty() || name.isBlank()) {
      return NAME;
    } else {
      return name;
    }
  }
}
