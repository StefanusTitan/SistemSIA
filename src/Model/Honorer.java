package Model;

public class Honorer extends Dosen {
    private double honorPerSKS;

    public Honorer(String nama, String alamat, String ttl, String telepon, String NIK, String departemen, double honorPerSKS) {
        super(nama, alamat, ttl, telepon, NIK, departemen);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return "Honorer{" +
                "honorPerSKS=" + honorPerSKS +
                '}';
    }
}
