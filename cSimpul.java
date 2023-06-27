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
public class cSimpul {
    cDokter data;
    cSimpul next;
    
    cSimpul(cDokter d){
        data=d; next=null;
    }
    
    public void setNext(cSimpul s){
        next=s;
    }
    
    public cSimpul getNext(){
        return next;
    }
    
    public cDokter getData(){
        return data;
    }
}
