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
class cPasien {
    private String nama, alamat, notelpon, norm;
    private int umur;
    
    cPasien(){System.out.println("Constructor 1 pasien...");}
    cPasien(String nam, String nor){
        nama=nam; norm=nor;
        System.out.println("Constructor 2 pasien...");
    }
    
    public void setNama(String nm){nama=nm;}
    public void setNoRM(String nr){norm=nr;}
    public void setUmur(int u){umur=u;}
    public void setAlamat(String a){alamat=a;}
    public void setNoTelpon(String nt){notelpon=nt;}
    
    public String getNama(){return(nama);}
    public String getNoRM(){return(norm);}
    public int getUmur(){return(umur);}
    public String getAlamat(){return(alamat);}
    public String getNoTelpon(){return(notelpon);}
    public String ToString(){return(norm+" "+nama+" "+umur+" Tahun");}
    
}
