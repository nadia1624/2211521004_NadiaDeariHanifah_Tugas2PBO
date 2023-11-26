import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false; 
       

        do {
            try {
                System.out.print("Masukkan nomor faktur: ");
                String nomorFaktur = scanner.next();

                System.out.print("Masukkan nama pelanggan: ");
                String namaPelanggan = scanner.next();

                System.out.print("Masukkan nama barang: ");
                String namaBarang = scanner.next();

                System.out.print("Masukkan harga barang: ");
                double hargaBarang = scanner.nextDouble();

                System.out.print("Masukkan jumlah beli: ");
                int jumlahBeli = scanner.nextInt();

                Faktur faktur = new Faktur(nomorFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBeli);

                System.out.println("\n==========Detail Faktur==========\n" + faktur);
                System.out.println("Total Bayar: " + faktur.hitungTotalBayar());
                System.out.println("=================================");

                inputValid = true; // Jika tidak terjadi exception, keluar dari perulangan
            } catch (Exception e) { //exception
                System.out.println("Terjadi kesalahan input \n" );
                System.out.println("========== Masukan Ulang ==========\n");
                scanner.nextLine(); // Membersihkan buffer input
            }
        } 
        while (!inputValid);

        scanner.close();
    
    }
}
