package Ihsanudin;

import java.util.ArrayList;

public class Departemen {
    //atribut dari departemen
    private String nama;
    private ArrayList<Karyawan> kar = new ArrayList<>();

    Departemen(String nama){
        this.nama = nama;
    }

    public void addKaryawan(Karyawan k){
        kar.add(k);
    }

    public void displayAll(){
        System.out.println("\nData Karyawan PT. Makmur Jaya :");
        for (Karyawan k : kar){
            k.display();
        }
    }

    public void displayTetap(){
        System.out.println("\n KARYAWAN TETAP");
        for (Karyawan k : kar){
            if (k instanceof Tetap){
                k.display();
            }
        }
    }

    public void displayKontrak(){
        System.out.println("\n KARYAWAN KONTRAK");
        for (int i = 0; i < kar.size(); i++) {
            Karyawan k = kar.get(i);
            if (k instanceof Kontrak){
                k.display();
            }
        }
    }
}
