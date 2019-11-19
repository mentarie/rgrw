package proyek.android.regrow.Model;

public class Pemberitahuan_model {
    private int id, deskripsi_gambar, gambar;
    private String deskripsi;

    public Pemberitahuan_model(int id, int deskripsi_gambar, int gambar, String deskripsi) {
        this.id = id;
        this.deskripsi_gambar = deskripsi_gambar;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getDeskripsi_gambar() {
        return deskripsi_gambar;
    }

    public void setDeskripsi_gambar(int deskripsi_gambar) { this.deskripsi_gambar = deskripsi_gambar; }

    public int getGambar() { return gambar; }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
