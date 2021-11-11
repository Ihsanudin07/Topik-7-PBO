package Ihsanudin;

public class Kontrak extends Karyawan{

    //atribut tambahan dari karyawan kontrak
    private int waktu;

    //membuat kontruktor karyawan kontrak dengan 3 parameter
    Kontrak(String nama, double gaDas, int waktu){
        super(nama, gaDas);
        this.waktu = waktu;
    }

    //membuat method display untuk karyawan kontrak
    public void display(){
        super.display();//menggunakan super untuk mengambil display dari kelas karyawan
        System.out.println("Waktu : " + waktu);
    }
}
