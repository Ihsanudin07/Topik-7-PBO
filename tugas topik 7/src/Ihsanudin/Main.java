package Ihsanudin;

public class Main {

    public static void main(String[] args) {

        Departemen makmurjaya = new Departemen("PT. Makmur Jaya :");

        //karyawan tetap
        Karyawan makmurjaya1 = new Tetap("Ihsanudin Pradana",10000,20000);
        makmurjaya.addKaryawan(makmurjaya1);
        Karyawan makmurjaya2 = new Tetap("joko",1000,203030);
        makmurjaya.addKaryawan(makmurjaya2);
        //karyawan kontrak
        Karyawan makmurjaya3 = new Kontrak("Putra ihsan",50000,10);
        makmurjaya.addKaryawan(makmurjaya3);

        makmurjaya.displayAll();
        makmurjaya.displayTetap();
        makmurjaya.displayKontrak();
    }
}
