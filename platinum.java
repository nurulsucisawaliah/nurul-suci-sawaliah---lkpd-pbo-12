/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

/**
 *
 * @author ASUS
 */
public class platinum extends gold { //Menggunakan Extends karena PlatinumMember merupakan subclass dari class gold
    int biaya = 45000;
    double diskon = 3/100;
    long pulsa;
    
    @Override
    protected void Benefit1(long lama){ //Access Modifier: Protected
        double biayaSewa = biaya * lama;
        double total = biayaSewa - (biayaSewa * diskon);
        System.out.println("Total Sewa  : " + total);
    }
    
    @Override
    protected void Benefit2(long lama){ //Access Modifier: Protected
        poin = 10 * lama;
        System.out.println("Jumlah Poin : " + poin);
    }
    
    @Override
    protected void Benefit3(){
        cashback = 10000;
        System.out.println("Jumlah Cashback : " + cashback);
    }
    
    protected void Benefit4(long lama){
        pulsa = 5000 * lama;
        System.out.println("Bonus Pulsa : " + pulsa);
    }
}
