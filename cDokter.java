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
class cDokter extends cPegawai {
    //atribut asli milik class anak
    private String sip, bidangmedis;
    
    cDokter(String id, String nm, String s, String bs){
        super(id,nm);
        sip=s; bidangmedis=bs; 
        System.out.println("Object dokter dibuat...");
    }
    
    public void setSIP(String sp){sip=sp;}
    public void setBidangMedis(String bm){bidangmedis=bm;}
    
    public String getSIP(){return(sip);}
    public String getBidangMedis(){return(bidangmedis);}
    public String ToString(){return(sip+" "+bidangmedis);}
    
    public void info(){
        super.info();
        System.out.println("SIP : "+sip);
        System.out.println("Bidang Medis : "+bidangmedis);
    }
    
}
