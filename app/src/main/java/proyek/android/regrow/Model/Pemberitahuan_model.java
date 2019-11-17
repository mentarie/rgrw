package proyek.android.regrow.Model;

public class Pemberitahuan_model {
    private int id;
    private String gambar, deskripsi, deskripsi_gambar;

    public Pemberitahuan_model(int id, String gambar, String deskripsi, String deskripsi_gambar) {
        this.id = id;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
        this.deskripsi_gambar = deskripsi_gambar;
    }

    public int getId() { return id; }

    public String getGambar() { return gambar; }

    public String getDeskripsi() { return deskripsi; }

    public String getDeskripsi_gambar() { return deskripsi_gambar; }
}
