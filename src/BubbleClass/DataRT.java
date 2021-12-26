
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
    
    public String displayDataRT() {
        String display = ("No. KK : "+ nokk + ",\t Kepala Keluarga : "+ 
                kepalakeluarga + ",\t Jumlah Anggota : " + anggota);
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
