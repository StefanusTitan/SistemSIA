package Controller;

import Model.*;

import javax.swing.*;
import java.util.ArrayList;

public class Functions implements Status {

    private ArrayList<User> users = new ArrayList<>();

    public Functions() {
        // Data Dummy
        var pbo = new MataKuliah();
        pbo.setNama("PBO");
        pbo.setKode("IF-301");
        pbo.setSks(3);

        var si = new MataKuliah();
        si.setSks(2);
        si.setNama("SI");
        si.setKode("SI-308");

        var prakPBO = new MataKuliah();
        prakPBO.setKode("IF-3P1");
        prakPBO.setNama("Praktikum PBO");
        prakPBO.setSks(1);

        var algo = new MataKuliah();
        algo.setSks(4);
        algo.setKode("IF-100");
        algo.setNama("Algoritma dan Pemrograman");

        var presensi1 = new Presensi();
        presensi1.setTanggal(23);
        presensi1.setStatus("Hadir");

        var presensi2 = new Presensi();
        presensi2.setStatus("Alpha");
        presensi2.setTanggal(24);

        var presensiStaff = new PresensiStaff();
        presensiStaff.setJam(2);
        presensiStaff.setStatus("Hadir");
        presensiStaff.setTanggal(23);

        var presensiStaff2 = new PresensiStaff();
        presensiStaff2.setJam(2);
        presensiStaff2.setTanggal(28);
        presensiStaff2.setStatus("Alpha");

        var matkulAmbil = new MatKulAmbil();
        matkulAmbil.setListPresensi(presensi1);
        matkulAmbil.setMataKuliahs(pbo);
        matkulAmbil.setN1(80);
        matkulAmbil.setN2(70);
        matkulAmbil.setN3(90);

        var matkulAmbil2 = new MatKulAmbil();
        matkulAmbil2.setMataKuliahs(si);
        matkulAmbil2.setListPresensi(presensi2);
        matkulAmbil2.setN1(66);
        matkulAmbil2.setN2(65);
        matkulAmbil2.setN3(80);

        var matkulAmbilMagister = new MatKulAmbil();
        matkulAmbilMagister.setMataKuliahs(pbo);
        matkulAmbilMagister.setListPresensi(presensi1);
        matkulAmbilMagister.setN1(60);
        matkulAmbilMagister.setN2(65);
        matkulAmbilMagister.setN3(88);

        var matkulAjar = new MatKulAjar();
        matkulAjar.setMataKuliahs(algo);
        matkulAjar.setMataKuliahs(pbo);
        matkulAjar.setListPresensiStaff(presensiStaff);

        var dummySarjana1 = new Sarjana();
        dummySarjana1.setNama("Stefanus Titan");
        dummySarjana1.setMatKulAmbils(matkulAmbil);
        dummySarjana1.setMatKulAmbils(matkulAmbil2);
        dummySarjana1.setAlamat("Jl. Subrata no.19");
        dummySarjana1.setJurusan("Teknik Informatika");
        dummySarjana1.setNIM("1121029");
        dummySarjana1.setTelepon("089644233930");
        dummySarjana1.setTtl("Wonogiri, Jawa Tengah");

        var dummyMagister1 = new Magister();
        dummyMagister1.setNama("NamaAjah");
        dummyMagister1.setMatKulAmbils(matkulAmbilMagister);
        dummyMagister1.setAlamat("AlamatIndah");
        dummyMagister1.setJurusan("Sistem Informasi");
        dummyMagister1.setNIM("2121030");
        dummyMagister1.setJudulTesis("Apakah Artinya Hidup");
        dummyMagister1.setTelepon("089613357898");
        dummyMagister1.setTtl("Bumi");

        var dosenTetap = new DosenTetap();
        dosenTetap.setNama("Pak Joko");
        dosenTetap.setAlamat("Bandung");
        dosenTetap.setTelepon("08888888");
        dosenTetap.setTtl("Bandung, Jawa Barat");
        dosenTetap.setSalary(1000000);
        dosenTetap.setDepartemen("Teknik Informatika");
        dosenTetap.setMatKulAjars(matkulAjar);
        dosenTetap.setNIK("111122223333");

        var doktor = new Doktor();
        doktor.setAlamat("Dimanasaja");
        doktor.setNama("Maji");
        doktor.setJurusan("DKV");
        doktor.setTtl("Bandar Lampung");
        doktor.setTelepon("08889999222");
        doktor.setNIM("3121050");
        doktor.setJudulPenelitian("Penelitian Gambar Kecoa");
        doktor.setNilaiSidang1(70);
        doktor.setNilaiSidang2(87);
        doktor.setNilaiSidang2(97);

        var karyawan = new Karyawan();
        karyawan.setNama("Nicholas");
        karyawan.setAlamat("Jalan Wkwkwk");
        karyawan.setTelepon("ini Nomor telp");
        karyawan.setSalary(500000);
        karyawan.setTtl("Kalo ga salah Indonesia");
        karyawan.setPresensiStaffs(presensiStaff);
        karyawan.setPresensiStaffs(presensiStaff2);

        users.add(dummyMagister1);
        users.add(dummySarjana1);
        users.add(dosenTetap);
        users.add(doktor);
        users.add(karyawan);
    }

    public double printGaji(String nik) {
        User findStaff = searchStaff(nik);
        double gaji = 0;
        if (findStaff != null) {
            if (findStaff instanceof Karyawan) {
                gaji = (printTotalAbsenDosen(nik) / 22) * ((DosenTetap) findStaff).getSalary();
            } else if (findStaff instanceof DosenTetap) {
                gaji = ((DosenTetap) findStaff).getSalary() + (printTotalAbsenDosen(nik) * 25000);
            } else {
                gaji = (printTotalAbsenDosen(nik) * ((Honorer) findStaff).getHonorPerSKS());
            }
        }
        return gaji;
    }

    public int printTotalAbsenDosen(String nik) {
        int totalAbsen = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Dosen) {
                if (((Dosen) users.get(i)).getNIK().equals(nik)) {
                    for (int j = 0; j < ((Dosen) users.get(i)).getMatKulAjars().size(); j++) {
                        for (int k = 0; k < ((Dosen) users.get(i)).getMatKulAjars().get(j).getListPresensiStaff().size(); k++) {
                            if (((Dosen) users.get(i)).getMatKulAjars().get(j).getListPresensiStaff().get(k).getStatus() == HADIR) {
                                totalAbsen++;
                            }
                        }
                    }
                }
            }
        }
        return totalAbsen;
    }

    public void printMatkulAmbil(String nim) {
        String txt = "";
        int totalPresensi = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Sarjana) {
                if (((Sarjana) users.get(i)).getNIM().equals(nim)) {
                    txt += "Mata kuliah yang diambil oleh siswa dengan NIM " + nim + " adalah: ";
                    for (int j = 0; j < ((Sarjana) users.get(i)).getMatKulAmbils().size(); j++) {
                        txt += ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getMataKuliahs().getNama() + ", ";
                        for (int k = 0; k < ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getListPresensi().size(); k++) {
                            if (((Sarjana) users.get(i)).getMatKulAmbils().get(j).getListPresensi().get(k).getStatus() == HADIR) {
                                totalPresensi++;
                            }
                        }
                    }
                }
            }
        }
        txt += "\nTotal Presensi: " + totalPresensi;
        JOptionPane.showMessageDialog(null, txt);
    }

    public void printMahasiswaTidakLulus(String kode) {
        double average = 0;
        int mhsCount = 0;
        String namaMatkul = "";
        int mhsFailed = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Sarjana) {
                mhsCount++;
                for (int j = 0; j < ((Sarjana) users.get(i)).getMatKulAmbils().size(); j++) {
                    if (((Sarjana) users.get(i)).getMatKulAmbils().get(j).getMataKuliahs().getKode().equals(kode)) {
                        namaMatkul = ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getMataKuliahs().getNama();
                        double n1 = ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getN1();
                        double n2 = ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getN2();
                        double n3 = ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getN3();
                        average = (n1 + n2 + n3) / 3;
                        if (average < 56) {
                            mhsFailed++;
                        }
                    }
                }
            }
        }
        String txt = "Sebanyak " + mhsFailed + " siswa dari " + mhsCount + " mahasiswa tidak lulus dari matakuliah " + namaMatkul;
        JOptionPane.showMessageDialog(null, txt);
    }

    public void printNR(String kode) {
        double average = 0;
        int size = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Sarjana) {
                for (int j = 0; j < ((Sarjana) users.get(i)).getMatKulAmbils().size(); j++) {
                    if (((Sarjana) users.get(i)).getMatKulAmbils().get(j).getMataKuliahs().getKode().equals(kode)) {
                        double total = 0;
                        total += ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getN1();
                        total += ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getN2();
                        total += ((Sarjana) users.get(i)).getMatKulAmbils().get(j).getN3();
                        average += total / 3;
                        size++;
                    }
                }
            }
        }
        average /= size;
        JOptionPane.showMessageDialog(null, "Rata-rata nilai akhir semua mahasiswa untuk mata kuliah kode " + kode + " adalah: " + average);
    }

    public void printUserData(User user) {
        if (user != null) {
            if (user instanceof Mahasiswa) {
                JOptionPane.showMessageDialog(null, "User Mahasiswa \n1. Nama: " + user.getNama() + "\n2. Alamat: " + user.getAlamat() + "\n3. Telepon: " + user.getTelepon() + "\n4. TTL: " + user.getTtl() + "\n5. NIM: " + ((Mahasiswa) user).getNIM() + "\n6. Jurusan: " + ((Mahasiswa) user).getJurusan());
            } else if (user instanceof DosenTetap) {
                JOptionPane.showMessageDialog(null, "User Dosen Tetap\n1. Nama: " + user.getNama() + "\n2. Alamat: " + user.getAlamat() + "\n3. Telepon: " + user.getTelepon() + "\n4. TTL: " + user.getTtl() + "\n5. NIK: " + ((DosenTetap) user).getNIK() + "\n6. Departemen: " + ((DosenTetap) user).getDepartemen() + "\n7. Salary: " + ((DosenTetap) user).getSalary() + "\n8. Mata Kuliah Ajar: " + ((DosenTetap) user).getMatKulAjars());
            } else if (user instanceof Honorer) {
                JOptionPane.showMessageDialog(null, "User Honorer\n1. Nama: " + user.getNama() + "\n2. Alamat: " + user.getAlamat() + "\n3. Telepon: " + user.getTelepon() + "\n4. TTL: " + user.getTtl() + "\n5. Departemen" + ((Honorer) user).getDepartemen() + "\n6. NIK: " + ((Honorer) user).getNIK() + "\n7. Honor Per SKS: " + ((Honorer) user).getHonorPerSKS() + "\n8. Mata Kuliah Ajar: " + ((Honorer) user).getMatKulAjars());
            } else if (user instanceof Karyawan) {
                JOptionPane.showMessageDialog(null, "User Karyawan: \n1. Nama: " + user.getNama() + "\n2. Alamat: " + user.getAlamat() + "\n3. Telepon: " + user.getTelepon() + "\n4. TTL: " + user.getTtl() + "\n5. NIK: " + ((Karyawan) user).getNIK() + "\n6. Salary: " + ((Karyawan) user).getSalary() + "\n7. Presensi Staff: " + ((Karyawan) user).getPresensiStaffs());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Unknown User [Null]", "Sorry!", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public void printNA(String nim, String kode) {
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Mahasiswa) {
                if (((Mahasiswa) users.get(i)).getNIM().equals(nim)) {
                    user = users.get(i);
                }
            }
        }
        double average = 0;
        if (user instanceof Sarjana) {
            for (int i = 0; i < ((Sarjana) user).getMatKulAmbils().size(); i++) {
                if (((Sarjana) user).getMatKulAmbils().get(i).getMataKuliahs().getKode().equals(kode)) {
                    double n1 = ((Sarjana) user).getMatKulAmbils().get(i).getN1();
                    double n2 = ((Sarjana) user).getMatKulAmbils().get(i).getN2();
                    double n3 = ((Sarjana) user).getMatKulAmbils().get(i).getN3();
                    average = (n1 + n2 + n3) / 3;
                }
            }
            JOptionPane.showMessageDialog(null, "Nilai akhir untuk mahasiswa NIM: " + nim + ", mata kuliah kode " + kode + ": " + average);
        } else if (user instanceof Doktor) {
            average = (((Doktor) user).getNilaiSidang1() + ((Doktor) user).getNilaiSidang2() + ((Doktor) user).getNilaiSidang3()) / 3;
            JOptionPane.showMessageDialog(null, "Nilai akhir untuk mahasiswa NIM: " + nim + " sidang: " + average);
        }
    }

    public User searchMhs(String nim, String nama) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Mahasiswa) {
                if (((Mahasiswa) users.get(i)).getNIM().equals(nim) && users.get(i).getNama().toLowerCase().equals(nama.toLowerCase())) {
                    return users.get(i);
                }
            }
        }
        return null;
    }

    public User searchStaff(String nik) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Staff) {
                if (((Staff) users.get(i)).getNIK().equals(nik)) {
                    return users.get(i);
                }
            }
        }
        return null;
    }

    public boolean Login(User user) {
        boolean loggedIn = false;
        if (user != null) {
            loggedIn = true;
        }
        return loggedIn;
    }
}
