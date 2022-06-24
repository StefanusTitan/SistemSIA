package Model;

import java.util.ArrayList;

public class MatKulAmbil {
    private MataKuliah mataKuliahs = new MataKuliah();
    private ArrayList<Presensi> listPresensi = new ArrayList<>();
    private double n1, n2, n3;

    public MatKulAmbil() {

    }

    public MatKulAmbil(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMataKuliahs() {
        return mataKuliahs;
    }

    public void setMataKuliahs(MataKuliah mataKuliahs) {
        this.mataKuliahs = mataKuliahs;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(Presensi listPresensi) {
        this.listPresensi.add(listPresensi);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatKulAmbil{" +
                "mataKuliahs=" + mataKuliahs +
                ", listPresensi=" + listPresensi +
                ", n1=" + n1 +
                ", n2=" + n2 +
                ", n3=" + n3 +
                '}';
    }
}
