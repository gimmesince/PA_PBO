package Hotel.Menu;


abstract public class Hotel {
    protected String jenis_kamar;
    protected int lantai_kamar;
    protected int harga_permalam;

    public String getJenis_kamar() {
        return jenis_kamar;
    }

    public void setJenis_kamar(String jenis_kamar) {
        this.jenis_kamar = jenis_kamar;
    }

    public int getLantai_kamar() {
        return lantai_kamar;
    }

    public void setLantai_kamar(int lantai_kamar) {
        this.lantai_kamar = lantai_kamar;
    }

    public int getHarga_permalam() {
        return harga_permalam;
    }

    public void setHarga_permalam(int harga_permalam) {
        this.harga_permalam = harga_permalam;
    }

    abstract String notice(String notice);
}
