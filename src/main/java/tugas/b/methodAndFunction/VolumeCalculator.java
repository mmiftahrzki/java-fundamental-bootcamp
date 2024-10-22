package tugas.b.methodAndFunction;

public class VolumeCalculator {
  public static void main(String[] args) {
    VolumeCalculator volume_calculator = new VolumeCalculator();

    int cube_volume = volume_calculator.calculateVolume(7);
    int block_volume = volume_calculator.calculateVolume(7, 7, 7);
    float cylinder_volume = volume_calculator.calculateVolume(7, 7);

    System.out.println("Volume dari kubus dengan sisi 7 adalah: " + cube_volume);
    System.out.println("Volume dari balok dengan panjang, lebar, dan tinggi 7 adalah: " + block_volume);
    System.out.println("Volume dari silinder dengan jari-jari dan tinggi 7 adalah: " + cylinder_volume);
  }

  public int calculateVolume(int side) {
    return side * side * side;
  }

  public int calculateVolume(int length, int width, int height) {
    return length * width * height;
  }

  public float calculateVolume(int radius, int height) {
    return 3.14159f * radius * radius * height;
  }
}
