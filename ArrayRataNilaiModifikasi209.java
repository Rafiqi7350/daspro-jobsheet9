import java.util.Scanner;

public class ArrayRataNilaiModifikasi209 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int [] nilaiMahasiswa = new int[jumlahMahasiswa];
        double total = 0;
        double rata2;

        for (int i =0; i< nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        for (int i = 0; i< nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i]>70) {
                System.out.println("Mahasiswa ke-" + i +" lulus!!");
            }
            total += nilaiMahasiswa [i];
        }
        rata2 = total/nilaiMahasiswa.length;
        System.out.println("Rata-rata nilai = " +rata2);
    }
}
