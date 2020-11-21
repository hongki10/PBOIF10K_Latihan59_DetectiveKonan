/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Detective Konan
 */

 public class KarakterUtama extends Karakter{
    private String tujuan;
    private String tim;

    public KarakterUtama(String nama, String peran, String tujuan, String tim) {
        super(nama, peran);
        this.tujuan = tujuan;
        this.tim = tim;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getTim() {
        return tim;
    }
    
    public void tampilKarakterUtama() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peran : " + getPeran());
        System.out.println("Tim : " + getTim());
        System.out.println("Tujuan : " + getTujuan());
        System.out.println("");
    }
}