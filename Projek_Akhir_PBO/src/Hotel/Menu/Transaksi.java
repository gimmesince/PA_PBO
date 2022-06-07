package Hotel.Menu;


public class Transaksi extends Hotel {
    private int id_transaksi;
    private String nama;
    private String email;
    private String tgl_cekin;
    private String tgl_cekout;
    private String fasilitas;
    private int total_harga;
    public Transaksi() {
        this.id_transaksi   = 0;
        this.nama           = "";
        this.email          = "";
        this.tgl_cekin      = "";
        this.tgl_cekout     = "";
        this.total_harga    = 0;
        this.jenis_kamar    = "";
        this.lantai_kamar   = 0;
        this.harga_permalam = 0;
        this.fasilitas    = "";
    }
    public Transaksi(int id_transaksi,
                     String nama,
                     String email,
                     String tgl_cekin,
                     String tgl_cekout,
                     int total_harga,
                     String jenis_kamar,
                     int lantai_kamar,
                     String fasilitas,
                     int harga_permalam) {

        this.id_transaksi = id_transaksi;
        this.tgl_cekin = tgl_cekin;
        this.tgl_cekout = tgl_cekout;
        this.nama = nama;
        this.email = email;
        this.total_harga = total_harga;
        this.jenis_kamar = jenis_kamar;
        this.lantai_kamar = lantai_kamar;
        this.fasilitas = fasilitas;
        this.harga_permalam = harga_permalam;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getTgl_cekin() {
        return tgl_cekin;
    }

    public void setTgl_cekin(String tgl_cekin) {
        this.tgl_cekin = tgl_cekin;
    }

    public String getTgl_cekout() {
        return tgl_cekout;
    }

    public void setTgl_cekout(String tgl_cekout) {
        this.tgl_cekout = tgl_cekout;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

    String notice(String notice) {
        String nama_notice = notice + " Berhasil Dibuat";
        return nama_notice;
    }

}
