
package ObjekClass;

import Database.Koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zidan
 */
public class keluarga {
    private int nomorKK;
    private String kepalaKeluarga;
    private String anak1;
    private String anak2;
    private String anak3;
    private String Alamat;

    public int getNomorKK() {
        return nomorKK;
    }

    public void setNomorKK(int nomorKK) {
        this.nomorKK = nomorKK;
    }

    public String getKepalaKeluarga() {
        return kepalaKeluarga;
    }

    public void setKepalaKeluarga(String kepalaKeluarga) {
        this.kepalaKeluarga = kepalaKeluarga;
    }

    public String getAnak1() {
        return anak1;
    }

    public void setAnak1(String anak1) {
        this.anak1 = anak1;
    }

    public String getAnak2() {
        return anak2;
    }

    public void setAnak2(String anak2) {
        this.anak2 = anak2;
    }

    public String getAnak3() {
        return anak3;
    }

    public void setAnak3(String anak3) {
        this.anak3 = anak3;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    
      public void simpan() {
        try {

            String url = "INSERT INTO keluarga VALUES (?,?,?,?,?,?)";
            Connection conn = (Connection) Koneksi.configDB();                                          //MENGKONEKSIKAN KE DATABASE
            PreparedStatement stm = conn.prepareStatement(url);                                         //MEMBUAT STATEMENT DATABASE
            stm.setInt(1, getNomorKK());
            stm.setString(2, getKepalaKeluarga());
            stm.setString(3, getAnak1());
            stm.setString(4, getAnak2());
            stm.setString(5, getAnak3());
            stm.setString(6, getAlamat());
            
            stm.execute();                                                                              //MENGEKSEKUSI STATEMENT

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");                              //MENAMPILKAN JOPTION DENGAN TAMPILAN "DATA BERHASIL DISIMPAN"
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
    }
}
