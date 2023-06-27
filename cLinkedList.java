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
public class cLinkedList {
    cSimpul head, tail;
    int jSimpul;
    
    cLinkedList(){
        head=tail=null;
        jSimpul=0;
    }
    
    public void tambahbelakang(cSimpul baru){
        if(tail==null){
            head=tail=baru;
        }
        else{
            tail.next=baru;
            tail=baru;
        }
        System.out.println("Penambahan Sukses...");
    }
    
    public void hapusdepan(){
        if(head==null){
            System.out.println("Linked List Kosong!");
        }
        else if(head.next==null){
            System.out.println("["+head.getData().getNama()+"] dihapus...");
            head=tail=null;
        }
        else{//Linked List Berisi Minimal 2 Simpul
            cSimpul t=head;
            head=head.next;
            System.out.println("["+t.getData().getNama()+"] dihapus...");
            t=null;
        }
    }
    
    public void print(){
        System.out.println("Isi Linked List : ");
        for(cSimpul t=head; t!=null; t=t.getNext()){
            System.out.println("["+t.getData().getNama()+"] ");
        }
        System.out.println(" ");
    }
    
    public void find(String f){
        boolean ada=false;
        System.out.println("Hasil Pencarian : ");
        for(cSimpul t=head; t!=null; t=t.getNext()){
            if(t.getData().getNama()==f){
                ada=true;
                break;
            }
        }
        if(ada==false){
            System.out.println("Tidak Ditemukan!");
        }
        else{
            System.out.println("Ditemukan...");
        }
        System.out.println(" ");
    }
}
