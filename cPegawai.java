/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasioop2;

/**
 *
 * @author Risca
 */
public class cPegawai {
    private String NIP;
    private String nama;
    
    cPegawai(String np, String nm){
        NIP=np; nama=nm;
        System.out.println("Object pegawai dibuat...");
    }
    
    private void rahasia(){
        System.out.println("Data Pegawai");
    }
    
    public void info(){
        rahasia();
        System.out.println("NIP : "+NIP+"["+nama+"]");
    }
    
    public void setNIP(String np){
        NIP=np;
    }
    
    public String getNIP(){
        return NIP;
    }
    
    public void setNama(String nm){
        nama=nm;
    }
    
    public String getNama(){
        return nama;
    }
}
