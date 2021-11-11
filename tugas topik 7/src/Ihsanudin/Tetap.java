package Ihsanudin;

public class Tetap extends Karyawan{

    //atribut tambahan dari karyawan tetap
    private double tuDas;

    //membuat kontruktor karyawan tetap dengan 3 parameter
    Tetap(String nama, double gaDas, double tuDas){
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    //membuat method display untuk karyawan tetap
    public void display(){
        super.display();//menggunakan super untuk mengambil display dari kelas karyawan
        System.out.println("Tunjangan Dasar : " +tuDas);
    }
}
