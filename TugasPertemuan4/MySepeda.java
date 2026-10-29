package TugasPBOAndeas;

import java.util.Scanner;

public class Sepeda {
    int totalJarak;
    String merekSepeda;

    void maju() {
        totalJarak = totalJarak + 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object sepeda " + merekSepeda + " Jarak tempuh " + totalJarak + " Km");
    }

    void mundur() {
        totalJarak = totalJarak - 5;
        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object sepeda " + merekSepeda + " Jarak tempuh " + totalJarak + " Km");
    }

    void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object sepeda " + merekSepeda + " Jarak tempuh akhir " + totalJarak + " Km");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sepeda sepedaSaya = new Sepeda();

        sepedaSaya.totalJarak = 0;

        System.out.print("Masukan merek sepeda : ");
        sepedaSaya.merekSepeda = scanner.nextLine();

        int menu;
        do {
            System.out.println("\\n=== MENU SEPEDA ===");
            System.out.println("1. Bergerak maju");
            System.out.println("2. Bergerak mundur");
            System.out.println("3. Berhenti");
            System.out.println("0. Exit");
            System.out.print("Pilih aksi: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    sepedaSaya.maju();
                    break;
                case 2:
                    sepedaSaya.mundur();
                    break;
                case 3:
                    sepedaSaya.berhenti();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 0);

        scanner.close();
    }
}