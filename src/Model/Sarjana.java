package Model;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatKulAmbil> matKulAmbils = new ArrayList<>();

    public Sarjana(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
    }

    public Sarjana() {

    }

    public ArrayList<MatKulAmbil> getMatKulAmbils() {
        return matKulAmbils;
    }

    public void setMatKulAmbils(MatKulAmbil matKulAmbils) {
        this.matKulAmbils.add(matKulAmbils);
    }

    @Override
    public String toString() {
        return "Sarjana{" +
                "matkulAmbil=" + matKulAmbils +
                '}';
    }
}
