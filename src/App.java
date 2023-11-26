import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

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

            Faktur faktur = new Faktur( nomorFaktur,namaPelanggan, namaBarang, hargaBarang, jumlahBeli);

            System.out.println("\n========== Detail Faktur ==========\n"+ faktur);
            System.out.println("Total Bayar : Rp.  " + faktur.hitungTotalBayar());
        }
        catch(Exception e){
            System.out.println("Terjadi Kesalahan Input"+e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}
