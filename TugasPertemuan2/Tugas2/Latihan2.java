package P3;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float p = 2f;
        float l = 5f;
        float hasilLuas = p * l;

        System.out.println("Flowchart 1");
        System.out.print("Luas persegi panjang adalah : " + hasilLuas);
        System.out.println("");
        System.out.println("");

        System.out.println("Flowchart 2");
        System.out.print(" Masukan nilai jari-jari : ");

        float radius = scan.nextFloat();
        float nilaiPhi = 3.14f;

        float luasLingkaran = nilaiPhi * radius * radius;
        float kelilingLingkaran = 2 * nilaiPhi * radius;

        System.out.println("Luas = " + luasLingkaran);
        System.out.println("Keliling = " + kelilingLingkaran);
        System.out.println("");

        System.out.println("Flowchart 3");
        System.out.print("Masukan nilai jam : ");
        int jamInput = scan.nextInt();

        System.out.print("Masukan nilai menit : ");
        int menitInput = scan.nextInt();

        System.out.print("masukan nilai detik : ");
        int detikInput = scan.nextInt();

        int totalDetik = (jamInput * 3600)
                       + (menitInput * 60)
                       + detikInput;

        System.out.println("total detik = " + totalDetik);

        scan.close();
    }
}