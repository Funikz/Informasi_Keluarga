/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleClass;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Database.Koneksi;
import BubbleClass.DataRT;
/**
 *
 * @author Zidan
 */
public class Bubble {
    private DataRT[] arr;
    private int nElemen;


    public Bubble(int max){
        arr = new DataRT[max];
        nElemen = 0;
        
    }
    
    private int insert;
    
    public int getInsert (int nokk, String kepalakeluarga, String anggota) {
        arr[nElemen] = new DataRT(nokk, kepalakeluarga, anggota);
        nElemen++;
        return insert;
    }

    public void insert(int nokk, String kepalakeluarga, String anggota){
        arr[nElemen] = new DataRT(nokk, kepalakeluarga, anggota);
        nElemen++;
    }

    //Ascending
    
    private int bubble;
    
    public int bubble() {
        int batas, i;
         for (batas = nElemen - 1 ; batas > 0 ; batas--) {
             for (i = 0 ; i < batas ; i++) {
                 if (arr[i].getNokk() > arr[i + 1].getNokk()) {
                     swap(i, i + 1);
                 }
             }
         }
        return bubble;
    }
     public void bubblesort() {
         int batas, i;
         for (batas = nElemen - 1 ; batas > 0 ; batas--) {
             for (i = 0 ; i < batas ; i++) {
                 if (arr[i].getNokk() > arr[i + 1].getNokk()) {
                     swap(i, i + 1);
                 }
             }
         }
     }

    //Descending
//    public void bubblesort() {
//        int batas, i;
//        for (batas = nElemen - 1 ; batas > 0 ; batas--) {
//            for (i = 0 ; i < batas ; i++) {
//                if (arr[i] < arr[i + 1]) {
//                    swap(i, i + 1);
//                    for (int j = 0 ; j < nElemen ; j++) {
//                    }
//                }
//            }
//        }
//    }

    public void swap(int one, int two) {
        DataRT temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void display() {
        for(int i = 0; i < nElemen ; i++){
            arr[i].displayDataRT();
        }
        System.out.println("");
    }

    
//    private final String display = getDisplay();
//    private int display;
    
    public String getDisplay() {
        String[] tampil = new String[6];
        int t = 0;
        
        for(int i = 0; i < nElemen ; i++){
//            arr[i].displayDataRT();
            tampil[t] = arr[i].displayDataRT();
        }
        String ta = tampil[0];
        System.out.println("");
        
        return ta;
    }   
}
