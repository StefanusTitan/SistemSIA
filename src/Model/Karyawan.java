package Model;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private double salary;
    private ArrayList<PresensiStaff> presensiStaffs = new ArrayList<>();

    public Karyawan() {

    }

    public Karyawan(String nama, String alamat, String ttl, String telepon, String NIK, double salary) {
        super(nama, alamat, ttl, telepon, NIK);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensiStaffs() {
        return presensiStaffs;
    }

    public void setPresensiStaffs(PresensiStaff presensiStaffs) {
        this.presensiStaffs.add(presensiStaffs);
    }

    @Override
    public String toString() {
        return "Karyawan{" +
                "salary=" + salary +
                ", presensiStaffs=" + presensiStaffs +
                '}';
    }
}
