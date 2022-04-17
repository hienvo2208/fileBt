import java.util.Random;

public class Bai4 {
    public static void main(String[] args) {
        Random random = new Random();
        long seed = 1000;
        random.setSeed(seed);
        for (int i = 0; i < 50; i++) {
            System.out.print("so ngau nhien: " + random.nextInt());
        }
    }
}
