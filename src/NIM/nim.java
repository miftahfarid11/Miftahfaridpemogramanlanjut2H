package NIM;

public class nim {
    public static void main(String[] args) {

    }

    private String JenjangPendidikan;
    private String Angkatan;
    private String Fakultas;
    private String Jurusan;
    private String JenisKelamin;
    private String NomorMahasiswa;


    public String Jenjang() {
        return JenjangPendidikan;
    }

    public void setJenjang(String JenjangPendidikan) {
        this.JenjangPendidikan = JenjangPendidikan;
    }

    public String getjenjangPendidikan() {
        char kodejenjang = JenjangPendidikan.charAt(0);
        if (kodejenjang == '1') {
            return "S1 (Sarjana)";
        } else if (kodejenjang == '2') {
            return "S2 (Magister)";
        }
        return "S3 (Doktor)";
    }

    public String Tahun() {
        return Angkatan;
    }

    public void setTahun(String TahunAngkatan) {
        this.Angkatan = TahunAngkatan;
    }

    public String gettahunAngkatan() {
        char kodetahun1 = Angkatan.charAt(1);
        char kodetahun2 = Angkatan.charAt(2);
        return "20" + kodetahun1 + kodetahun2;
    }

    public String fakultas() {
        return Fakultas;
    }

    public void setfakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    public String getfakultas() {
        char kodeFakultas = Fakultas.charAt(3);
        if (kodeFakultas == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (kodeFakultas == '2') {
            return "Syariah dan Hukum";
        } else if (kodeFakultas == '3') {
            return "Ushuluddin";
        } else if (kodeFakultas == '4') {
            return "Dakwah & Komunikasi";
        } else if (kodeFakultas == '5') {
            return "Sains dan Teknologi";
        } else if (kodeFakultas == '6') {
            return "Psikologi";
        } else if (kodeFakultas == '7') {
            return "Ekonomi dan Ilmu Sosial";
        } else if (kodeFakultas == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Unknown";
    }

    public String jurusan() {
        return Jurusan;
    }

    public void setjrsn(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public String getjurusan() {
        char kodejurusan1 = Jurusan.charAt(4);
        char kodejurusan2 = Jurusan.charAt(5);
        String sumkodejurusan = "" + kodejurusan1 + kodejurusan2;
        if (sumkodejurusan.equals("01")) {
            return "Teknik Informatika";
        } else if (sumkodejurusan.equals("02")) {
            return "Teknik Industri";
        } else if (sumkodejurusan.equals("03")) {
            return "Sistem Informasi";
        } else if (sumkodejurusan.equals("04")) {
            return " Matematika";
        } else if (sumkodejurusan.equals("05")) {
            return "Teknik Elektro";
        }
        return "Unknown";
    }

    public String jeniskelamin() {
        return JenisKelamin;
    }

    public void setJK(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getjenisKelamin() {
        char kodejeniskelamin = JenisKelamin.charAt(6);
        if (kodejeniskelamin == '1') {
            return "Laki-Laki";
        } else if (kodejeniskelamin == '2') {
            return "Perempuan";
        }
        return "UNKNOWN";
    }

    public String NourutMahasiswa() {
        return NomorMahasiswa;
    }

    public void setNoMahasiswa(String NomorUrutMahasiswa) {
        this.NomorMahasiswa = NomorUrutMahasiswa;
    }

    public String getnomorMahasiswa() {
        char kodemahasiswa1 = NomorMahasiswa.charAt(7);
        char kodemahasiswa2 = NomorMahasiswa.charAt(8);
        char kodemahasiswa3 = NomorMahasiswa.charAt(9);
        char kodemahasiswa4 = NomorMahasiswa.charAt(10);
        return "" + kodemahasiswa1 + kodemahasiswa2 + kodemahasiswa3 + kodemahasiswa4;

    }

    public void setNim(String nim) {
    }

    public char TahunMasuk() {
        return 0;
    }

    public char MenentukanJurusan() {
        return 0;
    }

    public char MenentukanFakultas() {
        return 0;
    }

    public char NomorUrutMahasiswa() {
        return 0;
    }

    public boolean JenisKelamin() {
        return false;
    }

    public char JenjangPendidikan() {
        return 0;
    }
}
