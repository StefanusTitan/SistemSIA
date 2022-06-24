package Model;

import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatKulAjar> matKulAjars = new ArrayList<>();

    public Dosen() {

    }

    public Dosen(String nama, String alamat, String ttl, String telepon, String NIK, String departemen) {
        super(nama, alamat, ttl, telepon, NIK);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatKulAjar> getMatKulAjars() {
        return matKulAjars;
    }

    public void setMatKulAjars(MatKulAjar matkul) {
        this.matKulAjars.add(matkul);
    }
}
