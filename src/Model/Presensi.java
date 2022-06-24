package Model;

public class Presensi implements Status {
    private int tanggal,status;

    public Presensi() {

    }

    public Presensi(int tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String lowerCaseStatus = status.toLowerCase();
        if(lowerCaseStatus.equals("hadir")) {
            this.status = HADIR;
        } else {
            this.status = ALPHA;
        }
    }

    @Override
    public String toString() {
        return "Presensi{" +
                "tanggal=" + tanggal +
                ", status=" + status +
                '}';
    }
}
