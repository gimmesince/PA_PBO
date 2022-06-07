package Hotel.Menu;

public class Kamar extends Hotel {

    private int id_kamar;

    public Kamar() {
        this.id_kamar = 0;
        this.jenis_kamar = "";
        this.lantai_kamar = 0;
        this.harga_permalam = 0;
    }

    public Kamar(int id_kamar, String jenis_kamar, int lantai_kamar, int harga_permalam) {
        this.id_kamar = id_kamar;
        this.jenis_kamar = jenis_kamar;
        this.lantai_kamar = lantai_kamar;
        this.harga_permalam = harga_permalam;
    }

    public int getId_kamar() {
        return id_kamar;
    }

    public void setId_kamar(int id_kamar) {
        this.id_kamar = id_kamar;
    }

    String notice(String notice) {
        String nama_notice = notice + " Berhasil Dibuat";
        return nama_notice;
    }
;
}
