/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleClass;

/**
 *
 * @author Zidan
 */
public class DataRT {
    private int nokk;
    private String kepalakeluarga;
    private String anggota;
    
    public DataRT (int nokk, String kepalakeluarga, String anggota) {
        this.nokk = nokk;
        this.kepalakeluarga = kepalakeluarga;
        this.anggota = anggota;
    }
    private final String display = displayDataRT();
    
    public String displayDataRT() {
        System.out.print("\tNo. KK : " + nokk);
        System.out.print(", Kepala Keluarga : " + kepalakeluarga);
        System.out.println(", Jumlah Anggota : " + anggota);
        
        return display;
    }

    public int getNokk() {
        return nokk;
    }

    public void setNokk(int nokk) {
        this.nokk = nokk;
    }

    public String getKepalakeluarga() {
        return kepalakeluarga;
    }

    public void setKepalakeluarga(String kepalakeluarga) {
        this.kepalakeluarga = kepalakeluarga;
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }  
}
