public class BukuMain19 {
    public static void main(String[] args) {
        
        Buku19 bk1 = new Buku19();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku19 bk2 = new Buku19("pahlawan" , "Rehan", 160, 29,  59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku19 bkFarhan = new Buku19("Pagi yang cerah", "Farhan", 200,10,90000);
        bkFarhan.terjual(1);
        bkFarhan.tampilInformasi();
    }
}
