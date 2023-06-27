/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasioop2;
import java.util.Scanner;
/**
 *
 * @author Risca
 */
public class appLinkedList {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        cDokter dr1 = new cDokter("212","Amalia Rodhya","1234/56/789000","Speialis");
        cDokter dr2 = new cDokter("215","Lawaahizh Hanifah","2345/67/890111","Spesialis");
        
        cLinkedList LL = new cLinkedList();
        int pilih=0;
        
        do{
           System.out.println("\nAplikasi Linked List");
           System.out.println("1. Tambah Data");
           System.out.println("2. Hapus Data");
           System.out.println("3. Lihat Data");
           System.out.println("4. Exit");
           System.out.print("Pilih = ");
           pilih = sc.nextInt();
           
           switch(pilih){
               case 1:
                   System.out.println("1. Amalia Rodhya");
                   System.out.println("2. Lawaahizh Hanifah");
                   System.out.print("Pilih = ");
                   pilih = sc.nextInt();
                   
                   switch(pilih){
                       case 1:
                           cSimpul s = new cSimpul(dr1);
                           LL.tambahbelakang(s);
                           break;
                       
                       case 2:
                           s = new cSimpul(dr2);
                           LL.tambahbelakang(s);
                           break;
                   }break;
                   
               case 2:
                   LL.hapusdepan();
                   break;
               
               case 3:
                   LL.print();
                   break;
                   
               case 4:
                   System.out.println("Terima Kasih...");
                   break;
                   
           }
        }while(pilih!=4);
    }
}
