package Model;

public class MatkulPilihan extends MataKuliah {
    private int minMhs;

    public MatkulPilihan(String kode, String nama, int sks, int minMhs) {
        super(kode, nama, sks);
        this.minMhs = minMhs;
    }

    public int getMinMhs() {
        return minMhs;
    }

    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }

    @Override
    public String toString() {
        return "MatkulPilihan{" +
                "minMhs=" + minMhs +
                '}';
    }
}
