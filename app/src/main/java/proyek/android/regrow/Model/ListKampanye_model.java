package proyek.android.regrow.Model;

public class ListKampanye_model {
    private int id, gambar;
    private String  judul, lokasi, danaterkumpul, sisahari;

    public ListKampanye_model(int id, int gambar, String judul, String lokasi, String danaterkumpul, String sisahari) {
        this.id = id;
        this.gambar = gambar;
        this.judul = judul;
        this.lokasi = lokasi;
        this.danaterkumpul = danaterkumpul;
        this.sisahari = sisahari;
    }

    public int getId() {return id;}

    public int getGambar() {return gambar;}

    public String getJudul() {return judul;}

    public String getLokasi() {return lokasi;}

    public String getDanaterkumpul() {return danaterkumpul;}

    public String getSisahari() {return sisahari;}
}
