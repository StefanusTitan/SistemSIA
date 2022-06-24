package Model;

public class Doktor extends Mahasiswa {
    private String judulPenelitian;
    private float nilaiSidang1, nilaiSidang2, nilaiSidang3;

    public Doktor() {

    }

    public Doktor(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan, String judulPenelitian, float nilaiSidang1, float nilaiSidang2, float nilaiSidang3) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.judulPenelitian = judulPenelitian;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    public float getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(float nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public float getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(float nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public float getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(float nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "judulPenelitian='" + judulPenelitian + '\'' +
                ", nilaiSidang1=" + nilaiSidang1 +
                ", nilaiSidang2=" + nilaiSidang2 +
                ", nilaiSidang3=" + nilaiSidang3 +
                '}';
    }
}
