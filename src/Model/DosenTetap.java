package Model;

public class DosenTetap extends Dosen {
    private double salary;

    public DosenTetap() {

    }

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String NIK, String departemen, double salary) {
        super(nama, alamat, ttl, telepon, NIK, departemen);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "DosenTetap{" +
                "salary=" + salary +
                '}';
    }
}
