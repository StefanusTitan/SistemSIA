package View;

import Controller.Functions;
import Model.*;

import javax.swing.*;

public class Main implements LoginMessages {

    public static void main(String[] args) {
        Functions functions = new Functions();
        int menu = 0;
        while (menu != 3) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1. Login Mahasiswa\n2. Login Staff\n3. Exit"));
            switch (menu) {
                case 1:
                    String nim = JOptionPane.showInputDialog("Masukkan NIM");
                    String nama = JOptionPane.showInputDialog("Masukkan nama");
                    var mhs = functions.searchMhs(nim, nama);
                    if (functions.Login(mhs)) {
                        JOptionPane.showMessageDialog(null, SUCCESS, "Berhasil!", JOptionPane.INFORMATION_MESSAGE);
                        int menuMhs = 0;
                        while (menuMhs != 4) {
                            menuMhs = Integer.parseInt(JOptionPane.showInputDialog("1. Print User Data\n2. Print NA\n3. Print Mata Kuliah Ambil\n4. Logout"));
                            switch (menuMhs) {
                                case 1:
                                    functions.printUserData(mhs);
                                    break;
                                case 2:
                                    String kode = JOptionPane.showInputDialog("Masukkan kode: ");
                                    functions.printNA(nim, kode);
                                    break;
                                case 3:
                                    functions.printMatkulAmbil(nim);
                                    break;
                            }
                        }
                    } else {
                        JOptionPane.showInputDialog(null, FAIL, "Gagal", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 2:
                    String nik = JOptionPane.showInputDialog("Masukkan NIK");
                    var staff = functions.searchStaff(nik);
                    if (functions.Login(staff)) {
                        JOptionPane.showMessageDialog(null, SUCCESS, "Berhasil!", JOptionPane.INFORMATION_MESSAGE);
                        int menuStaff = 0;
                        while (menuStaff != 8) {
                            menuStaff = Integer.parseInt(JOptionPane.showInputDialog("1. Print User Data\n2. Print Nilai Akhir Mata Kuliah\n3. Rata-Rata Nilai Akhir Seluruh Mahasiswa\n4. Print Jumlah Mahasiswa Tidak Lulus\n5. Print Mata Kuliah Ambil Siswa\n6. Print Total Absen Dosen\n7. Print Gaji\n8. Logout"));
                            switch (menuStaff) {
                                case 1:
                                    functions.printUserData(staff);
                                    break;
                                case 2:
                                    nim = JOptionPane.showInputDialog("Masukkan NIM");
                                    String kode = JOptionPane.showInputDialog("Masukkan Kode");
                                    functions.printNA(nim, kode);
                                    break;
                                case 3:
                                    kode = JOptionPane.showInputDialog("Masukkan Kode");
                                    functions.printNR(kode);
                                    break;
                                case 4:
                                    kode = JOptionPane.showInputDialog("Masukkan Kode ");
                                    functions.printMahasiswaTidakLulus(kode);
                                    break;
                                case 5:
                                    nim = JOptionPane.showInputDialog("Masukkan NIM");
                                    functions.printMatkulAmbil(nim);
                                    break;
                                case 6:
                                    nik = JOptionPane.showInputDialog("Masukkan NIK");
                                    JOptionPane.showMessageDialog(null, "Total absen dari dosen dengan NIK: " + nik + " adalah: " + functions.printTotalAbsenDosen(nik));
                                    break;
                                case 7:
                                    nik = JOptionPane.showInputDialog("Masukkan NIK");
                                    JOptionPane.showMessageDialog(null, "Total gaji dari dari staff dengan NIK: " + nik + " adalah: " + functions.printGaji(nik));
                                    break;
                                default:
                                    menuStaff = 8;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, FAIL, "Gagal", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                default:
                    menu = 3;
            }
        }
    }
}
