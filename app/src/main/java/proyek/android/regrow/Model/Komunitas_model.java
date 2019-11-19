package proyek.android.regrow.Model;

public class Komunitas_model {
    private int id, gambar;
    private String nama, keterangan, lokasi, pengikut;

    public Komunitas_model(int id, int gambar, String nama, String keterangan, String lokasi, String pengikut) {
        this.id = id;
        this.gambar = gambar;
        this.nama = nama;
        this.keterangan = keterangan;
        this.lokasi = lokasi;
        this.pengikut = pengikut;
    }

    public int getId() {
        return id;
    }

    public int getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getPengikut() {
        return pengikut;
    }
}
