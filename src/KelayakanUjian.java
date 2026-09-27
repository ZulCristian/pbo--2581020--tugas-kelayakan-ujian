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