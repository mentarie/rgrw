package proyek.android.regrow.Model;

public class Pemberitahuan_model {
    private int id, deskripsi_gambar;
    private String gambar, deskripsi;

    public Pemberitahuan_model(int id, int deskripsi_gambar, String gambar, String deskripsi) {
        this.id = id;
        this.deskripsi_gambar = deskripsi_gambar;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeskripsi_gambar() {
        return deskripsi_gambar;
    }

    public void setDeskripsi_gambar(int deskripsi_gambar) {
        this.deskripsi_gambar = deskripsi_gambar;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
