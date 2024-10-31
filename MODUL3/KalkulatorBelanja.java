import java.util.Scanner;

public class KalkulatorBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total harga belanjaan: ");
        double totalBelanja = scanner.nextDouble();

        System.out.print("Diskon (%): ");
        double diskon = scanner.nextDouble();

        System.out.print("Pajak (%): ");
        double pajak = scanner.nextDouble();

        double totalAkhir = totalBelanja * (1 - diskon / 100) * (1 + pajak / 100);
        
        System.out.println("Total yang harus dibayar: " + totalAkhir);
    }
}
