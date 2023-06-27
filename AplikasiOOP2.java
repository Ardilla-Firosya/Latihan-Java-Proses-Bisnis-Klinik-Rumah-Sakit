/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasioop2;
import java.util.Scanner ;

/**
 *
 * @author Risca
 */
public class AplikasiOOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        cPasien psn[] = new cPasien[5];
        psn[0]=new cPasien();
        psn[0].setNoRM("12089911");
        psn[0].setNama("Jeon Mi Do");
        psn[1]=new cPasien();
        psn[1].setNoRM("23190022");
        psn[1].setNama("Cho Yi Yhun");
        
        cDokter dr[] = new cDokter[3];
        
        //satu object Ruang Klinik untuk 1 Dokter dan banyak Pasien
        cRuangKlinik rk[] = new cRuangKlinik[3];
        
        
        //variabel pendukung
        int pilih;
        int jpsn, jdr, jrk=0;
        int maxpsn=5, maxdr=3, maxrk=3;
        jdr=0; jpsn=0;
        
        do{
           System.out.println("");
           System.out.println("MENU POLIKLINIK");
           System.out.println("1. Pasien");
           System.out.println("2. Pegawai");
           System.out.println("3. Ruang Klinik");
           System.out.println("4. Exit");
           System.out.print("Pilih = ");
           pilih = sc.nextInt();
           System.out.println("");
           
           switch(pilih){ 
            
            case 1: 
            System.out.println("Sub Menu Pasien");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien");
            System.out.println("3. Update Data Pasien");
            System.out.println("4. Cetak Data Pasien");
            System.out.println("5. Query");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            
            switch(pilih){
                case 1:
                System.out.println("== Tambah Pasien ==");
                if(jpsn<maxpsn){
                    System.out.print("Masukkan Nama = ");
                    sc = new Scanner(System.in);
                    String nama = sc.nextLine();
                    String norm="";
                    boolean sudahada;
                    do{
                        System.out.print("Masukkan No. Rekam Medis = ");
                        norm = sc.next();
                        sudahada=false;
                        for(int i=0;i<jpsn;i++){
                            if(psn[i].getNoRM().equalsIgnoreCase(norm)){
                                sudahada=true;
                                break;
                            }
                        }
                        if(sudahada){
                            System.out.println("No. Rekam Medis Sudah Ada!");
                        }
                    }while(sudahada==true);
                    
                    psn[jpsn]=new cPasien(nama, norm);
                    jpsn++;
                    System.out.println("Penambahan Sukses");
                }else{System.out.println("Kapasitas Penuh!");}
                break;
                    
                case 2:
                System.out.println("== Hapus Pasien ==");
                if(jpsn>0){
                    System.out.print("Masukkan No. Rekam Medis = ");
                    String norm = sc.next();
                    
                    boolean ketemu=false;
                    for(int i=0;i<jpsn;i++){
                        if(psn[i].getNoRM().equalsIgnoreCase(norm)){
                            ketemu=true;
                            System.out.println("Data ditemukan");
                            System.out.println("Dihapus? 1.Ya, 2.Tidak");
                            System.out.print("Pilih = ");
                            pilih = sc.nextInt();
                            if(pilih==1){
                                psn[i] = null;
                                for(int j=i;j<jpsn;j++){
                                    if(j==jpsn-1){
                                        psn[j]=null;
                                    }else{psn[j]=psn[j+1];}
                                }
                                jpsn--;
                                System.out.println("Penghapusan Sukses");
                            }else{System.out.println("Batal Hapus!");}
                            break;
                        }
                    }
                    if(!ketemu){
                        System.out.println("No. Rekam Medis Tidak Ada!");
                    }
                }else{System.out.println("Data Pasien Kosong!");}
                break;
                    
                case 3:
                System.out.println("== Update Data Pasien ==");
                if(jpsn>0){
                    System.out.print("Masukkan No. Rekam Medis = ");
                    String norm = sc.next();
                    
                    boolean ketemu=false;
                    for(int i=0;i<jpsn;i++){
                        if(psn[i].getNoRM().equalsIgnoreCase(norm)){
                            ketemu=true;
                            System.out.println("Data Ditemukan!");
                            System.out.print("Masukkan Nama Baru = ");
                            sc = new Scanner(System.in);
                            String nm = sc.nextLine();
                            System.out.println("Simpan? 1.Ya, 2.Tidak");
                            System.out.print("Pilih = ");
                            pilih = sc.nextInt();
                            if(pilih==1){
                                psn[i].setNama(nm);
                                System.out.println("Update Sukses");
                            }else{System.out.println("Batal Update!");}
                            break;
                        }
                    }
                    if(!ketemu){
                        System.out.println("No. Rekam Medis Tidak Ada!");
                    }
                }else{System.out.println("Data Pasien Kosong!");}
                break;
                    
                case 4:
                System.out.println("== Cetak Data Pasien ==");
                if(jpsn>0){
                    System.out.println("No.\tNORM\tNama");
                    for(int i=0;i<jpsn;i++){
                        System.out.print((i+1)+".");
                        System.out.print(psn[i].getNoRM()+"\t");
                        System.out.println(psn[i].getNama()+"\t");
                    }
                }else{System.out.println("Data Pasien Kosong!");}
                break;
             
                case 5:
                if(jpsn>0){
                    for(int i=0;i<jpsn;i++){
                        System.out.println(psn[i].ToString());
                    }
                }else{System.out.println("Data Pasien Kosong!");}
                break;
            }
            break;
            
            case 2:
            System.out.println("Sub Menu Pegawai");
            System.out.println("1. Tambah Dokter");
            System.out.println("2. Hapus Dokter");
            System.out.println("3. Update Data Dokter");
            System.out.println("4. Lihat Pegawai");
            System.out.println("5. Query");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            
            switch(pilih){
                case 1:
                System.out.println("== Tambah Dokter ==");
                if(jdr<maxdr){
                    String np,nm;
                    boolean sudahada;
                    do{
                        System.out.print("Masukkan NIP = ");
                        np = sc.next();
                        sudahada=false;
                        for(int i=0;i<jdr;i++){
                            if(dr[i].getNIP().equalsIgnoreCase(np)){
                                sudahada=true;
                                break;
                            }
                        }
                        if(sudahada){
                            System.out.println("NIP Sudah Ada!");
                        }
                    }while(sudahada==true);
                    
                    System.out.print("Masukkan Nama = ");
                    sc = new Scanner(System.in);
                    String nama = sc.nextLine();
                    System.out.print("Masukkan SIP = ");
                    String sp = sc.next();
                    System.out.print("Masukkan Bidang Medis = ");
                    sc = new Scanner(System.in);
                    String bm = sc.nextLine();
                    dr[jdr]=new cDokter(np, nama, sp, bm);
                    jdr++;
                    System.out.println("Penambahan Sukses");
                }else{System.out.println("Kapasitas Penuh!");}
                break;
                    
                case 2:
                System.out.println("== Hapus Dokter ==");
                if(jdr>0){
                    System.out.print("Masukkan NIP = ");
                    String np = sc.next();
                    
                    boolean ketemu=false;
                    for(int i=0;i<jdr;i++){
                        if(dr[i].getNIP().equalsIgnoreCase(np)){
                            ketemu=true;
                            System.out.println("Data ditemukan");
                            System.out.println("Dihapus? 1.Ya, 2.Tidak");
                            System.out.print("Pilih = ");
                            pilih = sc.nextInt();
                            if(pilih==1){
                                dr[i] = null;
                                for(int j=i;j<jdr;j++){
                                    if(j==jdr-1){
                                        dr[j]=null;
                                    }else{dr[j]=dr[j+1];}
                                }
                                jdr--;
                                System.out.println("Penghapusan Sukses");
                            }else{System.out.println("Batal Hapus!");}
                            break;
                        }
                    }
                    if(!ketemu){
                        System.out.println("NIP Tidak Ada!");
                    }
                }else{System.out.println("Data Dokter Kosong!");}
                break;
                    
                case 3:
                System.out.println("== Update Data Dokter ==");
                if(jdr>0){
                    System.out.print("Masukkan NIP Dokter = ");
                    String np = sc.next();
                    
                    boolean ketemu=false;
                    for(int i=0;i<jdr;i++){
                        if(dr[i].getNIP().equalsIgnoreCase(np)){
                            ketemu=true;
                            System.out.println("Data Ditemukan!");
                            System.out.print("Bidang medis baru = ");
                            sc = new Scanner(System.in);
                            String bdgm = sc.nextLine();
                            System.out.println("Simpan? 1.Ya, 2.Tidak");
                            System.out.print("Pilih = ");
                            pilih = sc.nextInt();
                            if(pilih==1){
                                dr[i].setBidangMedis(bdgm);
                                System.out.println("Update Sukses");
                            }else{System.out.println("Batal Update!");}
                            break;
                        }
                    }
                    if(!ketemu){
                        System.out.println("NIP Tidak Ada!");
                    }
                }else{System.out.println("Data Dokter Kosong!");}
                break;
                    
                case 4:
                System.out.println("== Data Pegawai ==");
                if(jdr>0){
                    System.out.println("== Dokter ==");
                    for(int i=0;i<jdr;i++){
                        dr[i].info();
                    }
                }else{System.out.println("Data Dokter Kosong!");}
                break;
             
                case 5:
                if(jdr>0){
                    for(int i=0;i<jdr;i++){
                        System.out.println(dr[i].ToString());
                    }
                }else{System.out.println("Data Dokter Kosong!");}
                break;
            }
            break;
              
            case 3:
            System.out.println("Sub Menu Ruang Klinik");
            System.out.println("1. Buat Data Ruang Klinik");
            System.out.println("2. Hapus Data Ruang Klinik");
            System.out.println("3. Ambil Pasien");
            System.out.println("4. Hapus Pasien");
            System.out.println("5. Cetak Data");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            
            switch(pilih){
                case 1:
                System.out.println("==Buat Data Ruang Klinik==");
                if(jrk<maxrk){
                    System.out.print("Masukkan Nama Ruang = ");
                    String nmruang=sc.next();
                    System.out.print("Masukkan Tanggal Konsultasi = ");
                    String tgl=sc.next();
                    System.out.print("Masukkan SIP Dokter = ");
                    String sp=sc.next();
                    
                    boolean ketemu=false;
                    for(int i=0;i<jdr;i++){
                        if(dr[i]!=null&&dr[i].getSIP().equalsIgnoreCase(sp)){ 
                            ketemu=true;
                            rk[i]=new cRuangKlinik();
                            rk[i].setDokter(dr[i]);
                            rk[i].setNamaRuang(nmruang);
                            rk[i].setTanggal(tgl);
                            jrk++;
                            System.out.println("Sukses Tambah Data...");
                            break;
                        }   
                    }
                    if(ketemu==false){
                        System.out.println("SIP Tidak Ada");
                    }
                }else{System.out.println("Kapasitas Ruang Klinik Penuh!");}
                break;  
                
                case 2:
                System.out.println("==Hapus Data Ruang Klinik==");
                if(jrk>0){
                    System.out.print("Masukkan Nama Ruang = ");
                    String nmruang=sc.next();
                    System.out.print("Masukkan Tanggal Konsultasi = ");
                    String tgl=sc.next();
                    System.out.print("Masukkan SIP Dokter = ");
                    String sp=sc.next();
                    
                    boolean ketemu=false;
                    for(int i=0;i<jrk;i++){
                       if(rk[i]!=null&&rk[i].getDokter().getSIP().equalsIgnoreCase(sp)){
                            if(rk[i].getNamaRuang().equalsIgnoreCase(nmruang)){
                                if(rk[i].getTanggal().equalsIgnoreCase(tgl)){
                                ketemu=true;
                                System.out.println("Dihapus? 1.Ya 2.Tidak");
                                System.out.print("Pilih = ");
                                pilih=sc.nextInt();
                                if(pilih==1){
                                    rk[i]=null;
                                    int t=0;
                                    for(int j=i;j<jrk;j++){
                                        if(j==jrk-1){rk[j]=null;}
                                        else{rk[j]=rk[j+1];}
                                    }
                                    jrk--;
                                    System.out.println("Hapus Sukses");
                                }else{System.out.println("Batal Hapus!");}
                                break;
                            }
                        }
                       }
                    }
                    if(ketemu==false){
                        System.out.println("Tidak Ada Data Ruang Klinik");
                    }
                }else{System.out.println("Belum Ada Data Ruang Klinik");}
                break;
                
                case 3:
                System.out.println("==Ambil Pasien==");
                if(jrk>0){
                    System.out.print("Masukkan Nama Ruang = ");
                    String nmrg=sc.next();
                    System.out.print("Masukkan Tanggal Konsultasi = ");
                    String tnggl=sc.next();
                    System.out.print("Masukkan SIP Dokter = ");
                    String sip=sc.next();
                    
                    //validasi nama ruang, tanggal konsultasi, dokter, dan no rekam medis pasien
                    boolean ketemu=false;
                    for(int i=0;i<jrk;i++){
                        if(rk[i]!=null&&rk[i].getDokter().getSIP().equalsIgnoreCase(sip)){
                            if(rk[i].getNamaRuang().equalsIgnoreCase(nmrg)){
                                if(rk[i].getTanggal().equalsIgnoreCase(tnggl)){
                                    ketemu=true;
                                    System.out.print("Masukkan No Rekam Medis Pasien = ");
                                    String norm = sc.next();
                        
                                    for(int j=0;j<jpsn;j++){
                                        if(psn[j]!=null&&psn[j].getNoRM().equalsIgnoreCase(norm)){
                                            System.out.println("Tambah? 1.Ya 2.Tidak");
                                            System.out.print("Pilih = ");
                                            pilih=sc.nextInt();
                                            if(pilih==1){rk[i].tambahPasien(psn[j]);}
                                        }else{System.out.println("Batal Tambah");}
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if(ketemu==false){System.out.println("Data Ruang Klinik Tidak Ada");}
                }else{System.out.println("Belum Ada Data Ruang Klinik");}
                break;
                    
                case 4:
                System.out.println("==Hapus Pasien==");
                if(jrk>0){
                    System.out.print("Masukkan Nama Ruang = ");
                    String nmrg=sc.next();
                    System.out.print("Masukkan Tanggal Konsultasi = ");
                    String tnggl=sc.next();
                    System.out.print("Masukkan SIP Dokter = ");
                    String sip=sc.next();
                    
                    boolean ketemu=false;
                    for(int i=0;i<jrk;i++){
                        if(rk[i].getNamaRuang().equalsIgnoreCase(nmrg)){
                            if(rk[i].getTanggal().equalsIgnoreCase(tnggl)){
                                if(rk[i].getDokter().getSIP().equalsIgnoreCase(sip)){
                                    cPasien p[]=rk[i].getPasien();
                                    System.out.println("Daftar Data Ruang Klinik");
                                    for(int j=0;j<rk[i].getJPSN();j++){
                                        System.out.print(" "+p[j].getNoRM()+"\t");
                                        System.out.println(p[j].getNama());
                                    }
                                    System.out.print("Masukkan No Rekam Medis Pasien = ");
                                    String norm = sc.next();
                                    
                                    for(int j=0;j<jpsn;j++){
                                        if(psn[j]!=null&&psn[j].getNoRM().equalsIgnoreCase(norm)){
                                            System.out.println("Hapus? 1.Ya 2.Tidak");
                                            System.out.print("Pilih = ");
                                            pilih=sc.nextInt();
                                            if(pilih==1){rk[i].hapusPasien(norm);}
                                        }else{System.out.println("Batal Hapus");}
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if(ketemu==false){System.out.println("Data Ruang Klinik Tidak Ada");}
                }else{System.out.println("Belum Ada Data Ruang Klinik");}
                break;                    
                
                case 5:
                System.out.println("== Cetak Data ==");
                if(jrk>0){
                    System.out.print("Masukkan Nama Ruang = ");
                    String nmrg=sc.next();
                    System.out.print("Masukkan Tanggal Konsultasi = ");
                    String tnggl=sc.next();
                    System.out.print("Masukkan SIP Dokter = ");
                    String sip=sc.next();
                    
                    boolean ketemu=false;
                    for(int i=0;i<jrk;i++){
                        if(rk[i].getNamaRuang().equalsIgnoreCase(nmrg)){
                            if(rk[i].getTanggal().equalsIgnoreCase(tnggl)){
                                if(rk[i].getDokter().getSIP().equalsIgnoreCase(sip)){
                                    ketemu=true;
                                    if(rk[i].getJPSN()>0){
                                        System.out.println(rk[i].ToString());
                                    }else{System.out.println("Data Ruang Klinik Belum Ada");}
                                    break;
                                }
                            }
                        }
                    }
                    if(ketemu==false){System.out.println("Data Ruang Klinik Tidak Ada!");}
                }else{System.out.println("Ruang Klinik Kosong!");}
                break;
            }
            break;
  
            case 4:
            System.out.println("Terima kasih...");
           
           }
        }while (pilih!=4);
    }
    
}
