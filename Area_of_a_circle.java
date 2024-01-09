import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedArea = df.format(area);

        System.out.println(formattedArea);
    }
}
