package Ihsanudin;

public class Karyawan {

    //membuat atribut dari karyawan
    protected String nama;
    protected double gaDas;

    //membuat konstruktor karyawan dengan 2 parameter
    Karyawan(String nama, double gaDas){
        this.nama = nama;
        this.gaDas = gaDas;
    }

    //membuat method display
    public void display(){
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Dasar : " + gaDas);
    }
}
