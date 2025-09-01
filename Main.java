import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Scanner dan disimpan ke variabel scan
        Scanner scan = new Scanner(System.in);

        // Membaca input nama dari user
        String name = scan.nextLine();
        // Membaca input tahun angkatan dari user
        int tahun_angkatan = scan.nextInt();
        // Membaca input IPK dari user
        double ipk = scan.nextDouble();

        // Menampilkan output hello dengan nama user
        System.out.println("Hello, " + name);

        // Menampilkan output tahun angkatan user
        System.out.println("Saya dari angkatan " + tahun_angkatan);

        // Menampilkan output dengan format tertentu dengan IPK user
        System.out.printf("Saya memiliki IPK %.3f %.4f %.5f %.2f\n", ipk, ipk, ipk, ipk);
        System.out.println("Hello, World");

        // Menutup objek Scanner
        scan.close();
    }
}
