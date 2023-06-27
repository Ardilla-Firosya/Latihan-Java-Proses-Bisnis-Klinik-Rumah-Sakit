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
class cRuangKlinik {
    private cPasien psn[];
    private cDokter dr;
    private String namaruang;
    private String tgl;
    private int jpsn; 
    private int maxpsn;
    
    cRuangKlinik(){
        maxpsn=5; psn=new cPasien[maxpsn]; dr=null; jpsn=0;
        System.out.println("Object Ruang Klinik dibuat...");
    }
    
    public void tambahPasien(cPasien p){
        if(jpsn<=maxpsn){
            psn[jpsn]=p;
            jpsn++;
            System.out.println("Tambah Pasien Sukses...");
        }
        else{System.out.println("Jumlah Pasien Melebihi Batas!");}
    }
    
    public void hapusPasien(String hp){
        for (int i=0; i<jpsn; i++){
            if(i==jpsn-1){
                psn[i]=null;
            }
            else{psn[i]=psn[i+1];}
        jpsn--;
        System.out.println("Hapus Pasien Sukses!");
        break;
        }
    }
    
    public int getJPSN(){return jpsn;}
    public void setPasien(cPasien[] p){psn=p;}
    public void setDokter(cDokter d){dr=d;}
    public void setTanggal(String tl){tgl=tl;}
    public String getTanggal(){return(tgl);}
    public cPasien[] getPasien(){return psn;}
    public String getNamaRuang(){return(namaruang);}
    public cDokter getDokter(){return dr;}
    public void setNamaRuang(String nm){namaruang=nm;}
    public String ToString(){
        String temp = tgl;
        temp = temp + "\nRuang "+namaruang;
        temp = temp + "\nNo. Rekam Medis\tNama Pasien\n";
        
        for(int i=0; i<jpsn; i++){
            temp = temp + (i+1)+" ";
            temp = temp + psn[i].getNoRM()+"\t";
            temp = temp + psn[i].getNama()+"\t";
        }
        return temp;
    }
}
