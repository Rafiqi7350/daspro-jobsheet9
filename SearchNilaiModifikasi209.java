import java.util.Scanner;

public class SearchNilaiModifikasi209 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();
        
        int[] arrNilai = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.print("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-"+ (1+hasil));
        } else {
            System.out.print("Nilai yang dicari tidak ditemukan");
        }
    }
}
