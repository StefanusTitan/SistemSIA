package Model;

import java.util.ArrayList;

public class Magister extends Sarjana {
    private String judulTesis;

    public Magister() {

    }

    public Magister(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan, String judulTesis) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.judulTesis = judulTesis;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return "Magister{" +
                "judulTesis='" + judulTesis + '\'' +
                '}';
    }
}
