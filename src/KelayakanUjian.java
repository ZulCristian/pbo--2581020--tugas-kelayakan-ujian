import java.util.Scanner;

public class KelayakanUjian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kehadiran (%) : ");
        int kehadiran = sc.nextInt();

        System.out.print("Nilai tugas   : ");
        int nilaiTugas = sc.nextInt();

        System.out.print("Dispensasi (true/false): ");
        boolean dispensasi = sc.nextBoolean();

        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;
        boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;
        boolean c = kehadiran >= 75 && (nilaiTugas >= 60 || dispensasi);

        boolean bukanDispensasi = !dispensasi;

        System.out.println();
        System.out.println("===== KELAYAKAN UJIAN =====");
        System.out.println("Kehadiran    : " + kehadiran + "%");
        System.out.println("Nilai tugas  : " + nilaiTugas);
        System.out.println("Dispensasi   : " + dispensasi);
        System.out.println();
        System.out.println("a (tanpa kurung)      : " + a);
        System.out.println("b (kurung precedence) : " + b);
        System.out.println("c (kurung digeser)    : " + c);
        System.out.println("!dispensasi           : " + bukanDispensasi);

        int cek = 0;
        boolean x = (kehadiran >= 75) && (cek++ >= 0);
        boolean y = (nilaiTugas >= 60) || (cek++ >= 0);
        System.out.println("cek dipanggil: " + cek);
    }
}