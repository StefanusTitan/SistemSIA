package Model;

public class Staff extends User {
    private String NIK;

    public Staff() {

    }

    public Staff(String nama, String alamat, String ttl, String telepon, String NIK) {
        super(nama, alamat, ttl, telepon);
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "NIK='" + NIK + '\'' +
                '}';
    }
}
