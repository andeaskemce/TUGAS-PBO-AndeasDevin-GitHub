package P2;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tahunInput;

        System.out.print("Masukan Tahun (1909 - 2024) : ");
        tahunInput = scan.nextInt();

        if (tahunInput >= 1909 && tahunInput <= 2024) {
            if (tahunInput % 4 == 0) {
                System.out.println(tahunInput + " adalah tahun kabisat");
            } else {
                System.out.println(tahunInput + " bukan tahun kabisat");
            }
        } else {
            System.out.println("Tahun yang anda input tidak masuk dalam range");
        }

        scan.close();
    }
}