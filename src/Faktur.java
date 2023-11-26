public class Faktur extends barang {
    private String nomorFaktur;
    private String namaPelanggan;

    public Faktur(String nomorFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBeli ){
        super(namaBarang, hargaBarang, jumlahBeli); //memanggil method barang dari kelas barang
        this.nomorFaktur = nomorFaktur;
        this.namaPelanggan =namaPelanggan;
    }

    @Override
    public double hitungTotalBayar(){
        return super.hitungTotalBayar();//memanggil method hitungTotalBayar dari kelas barang
    }

    @Override
    public String toString(){
        return "Nomor Faktur :" + nomorFaktur + "\nNama Pelanggan :" + namaPelanggan + "\n" + super.toString();
    }
}
