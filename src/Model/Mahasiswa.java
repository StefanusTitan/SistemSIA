package Model;

public abstract class Mahasiswa extends User {
    private String NIM, jurusan;

    public Mahasiswa() {

    }

    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan) {
        super(nama, alamat, ttl, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + NIM + '\'' +
                ", jurusan='" + jurusan + '\'' +
                '}';
    }
}
