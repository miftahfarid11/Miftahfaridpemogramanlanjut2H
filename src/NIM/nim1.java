package NIM;
import java.util.Scanner;
public class nim1 {
    public void nim1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama  = ");
        String Nama = sc.nextLine();
        System.out.print("Kelas = ");
        String Kelas = sc.nextLine();
        System.out.print("NIM   = ");
        String nim = sc.nextLine();
        nim Nim = new nim();
        Nim.setNim(nim);
        System.out.println("--------------------------------");
        System.out.println(Nim.JenjangPendidikan());
        System.out.println(Nim.TahunMasuk());
        System.out.println(Nim.MenentukanFakultas());
        System.out.println(Nim.MenentukanJurusan());
        System.out.println(Nim.JenisKelamin());
        System.out.println(Nim.NomorUrutMahasiswa());
    }
}

