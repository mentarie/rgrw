package proyek.android.regrow.Model;

import android.graphics.drawable.Drawable;

public class Komunitas_model {
    private int id;
//    private Drawable gambar;
    private String gambar, nama, keterangan, lokasi, pengikut;

    public Komunitas_model(int id, String gambar, String nama, String keterangan, String lokasi, String pengikut) {
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

    public String getGambar() {
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
