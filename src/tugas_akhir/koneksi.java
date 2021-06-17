/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ChocoLava
 */
public class koneksi {
    
        public static Connection con = null;
        public static Connection ambil_koneksi(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa_sakti","root","");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
