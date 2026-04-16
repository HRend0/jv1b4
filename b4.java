import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float rong, cao, dtich, chuvi;
        System.out.print("Input:\n");
        System.out.print("width: ");
        rong = input.nextFloat();
        System.out.print("height: ");
        cao = input.nextFloat();
        dtich = rong * cao;
        chuvi = (rong + cao) * 2;

        System.out.println("\nOutput:");
        System.out.printf("Diện tích: %.2f\n", dtich);
        System.out.printf("Chu vi: %.2f\n", chuvi);

        input.close();
    }
}