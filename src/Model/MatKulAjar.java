package Model;

import java.util.ArrayList;

public class MatKulAjar {
    private ArrayList<MataKuliah> mataKuliahs = new ArrayList<>();
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public MatKulAjar() {

    }

    public MatKulAjar(ArrayList<MataKuliah> mataKuliahs, ArrayList<PresensiStaff> listPresensiStaff) {
        this.mataKuliahs = mataKuliahs;
        this.listPresensiStaff = listPresensiStaff;
    }

    public ArrayList<MataKuliah> getMataKuliahs() {
        return mataKuliahs;
    }

    public void setMataKuliahs(MataKuliah mataKuliahs) {
        this.mataKuliahs.add(mataKuliahs);
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(PresensiStaff listPresensiStaff) {
        this.listPresensiStaff.add(listPresensiStaff);
    }

    @Override
    public String toString() {
        return "MatKulAjar{" +
                "mataKuliahs=" + mataKuliahs +
                ", listPresensiStaff=" + listPresensiStaff +
                '}';
    }
}
