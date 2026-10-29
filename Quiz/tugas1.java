package TugasPBOAndeas;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=====================================================================================================");
        System.out.println("                              SISTEM PENGELOLAAN NILAI MAHASISWA                                     ");
        System.out.println("=====================================================================================================");
        System.out.print("Input jumlah mahasiswa : ");
        int banyak = scan.nextInt();
        scan.nextLine();

        String[] nim = new String[banyak];
        String[] mahasiswa = new String[banyak];
        char[] grade = new char[banyak];
        String[] keterangan = new String[banyak];

        double[] nilaiTugas = new double[banyak];
        double[] nilaiUTS = new double[banyak];
        double[] nilaiUAS = new double[banyak];
        double[] nilaiAkhir = new double[banyak];

        int jumlahLulus = 0;
        int jumlahGagal = 0;
        double akumulasiNilai = 0;
        double tertinggi = Double.MIN_VALUE;
        double terendah = Double.MAX_VALUE;

        for (int i = 0; i < banyak; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("---------------------------------------------");

            System.out.print("NPM : ");
            nim[i] = scan.nextLine();

            System.out.print("Nama : ");
            mahasiswa[i] = scan.nextLine();

            System.out.print("Nilai Tugas : ");
            nilaiTugas[i] = scan.nextDouble();

            System.out.print("Nilai UTS   : ");
            nilaiUTS[i] = scan.nextDouble();

            System.out.print("Nilai UAS   : ");
            nilaiUAS[i] = scan.nextDouble();

            nilaiAkhir[i] = (nilaiTugas[i] * 0.30)
                          + (nilaiUTS[i] * 0.30)
                          + (nilaiUAS[i] * 0.40);

            if (nilaiAkhir[i] >= 80) {
                grade[i] = 'A';
                keterangan[i] = "LULUS";
                jumlahLulus++;
            } else if (nilaiAkhir[i] >= 70) {
                grade[i] = 'B';
                keterangan[i] = "LULUS";
                jumlahLulus++;
            } else if (nilaiAkhir[i] >= 60) {
                grade[i] = 'C';
                keterangan[i] = "LULUS";
                jumlahLulus++;
            } else if (nilaiAkhir[i] >= 50) {
                grade[i] = 'D';
                keterangan[i] = "TIDAK LULUS";
                jumlahGagal++;
            } else {
                grade[i] = 'E';
                keterangan[i] = "TIDAK LULUS";
                jumlahGagal++;
            }

            akumulasiNilai += nilaiAkhir[i];

            if (nilaiAkhir[i] > tertinggi) {
                tertinggi = nilaiAkhir[i];
            }

            if (nilaiAkhir[i] < terendah) {
                terendah = nilaiAkhir[i];
            }

            scan.nextLine();
            System.out.println();
        }

        System.out.println("=====================================================================================================");
        System.out.println("                                    DAFTAR NILAI MAHASISWA                                           ");
        System.out.println("=====================================================================================================");

        System.out.printf("%-3s %-12s %-25s %-6s %-6s %-6s %-6s %-6s %-12s\n",
                "No", "NPM", "Nama", "Tugas", "UTS", "UAS",
                "Akhir", "Huruf", "Status");

        for (int i = 0; i < banyak; i++) {
            System.out.printf("%-3s %-12s %-25s %-6s %-6s %-6s %-6s %-6s %-12s\n",
                    (i + 1), nim[i], mahasiswa[i],
                    nilaiTugas[i], nilaiUTS[i], nilaiUAS[i],
                    nilaiAkhir[i], grade[i], keterangan[i]);
        }

        System.out.println();
        System.out.println("STATISTIK NILAI");
        System.out.println("========================================");
        System.out.println("Jumlah Mahasiswa       : " + banyak);
        System.out.println("Jumlah Mahasiswa Lulus : " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus     : " + jumlahGagal);
        System.out.println("Nilai Tertinggi        : " + tertinggi);
        System.out.println("Nilai Terendah         : " + terendah);
        System.out.println("Rata-rata Kelas        : " + (akumulasiNilai / banyak));

        scan.close();
    }
}