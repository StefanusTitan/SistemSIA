package Model;

public class PresensiStaff extends Presensi {
    private int jam;

    public PresensiStaff() {

    }

    public PresensiStaff(int tanggal, int status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "PresensiStaff{" +
                "jam='" + jam + '\'' +
                '}';
    }
}
