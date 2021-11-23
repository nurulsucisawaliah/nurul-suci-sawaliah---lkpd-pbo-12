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
public class gold extends silver{
    int biaya = 30000;
    double diskon = 2/100; //Diskon untuk Member Gold
    int cashback;
    
    @Override
    protected void Benefit1(long lama){ //Access Modifier: Protected
        double biayaSewa = biaya * lama;
        double total = biayaSewa - (biayaSewa * diskon);
        System.out.println("Total Sewa  : " + total);
    }
    
    @Override
    protected void Benefit2(long lama){ //Access Modifier: Protected
        poin = 5 * lama;
        System.out.println("Jumlah Poin : " + poin);
    }
    
    protected void Benefit3(){
        cashback = 5000;
        System.out.println("Jumlah Cashback : " + cashback);
    }
}
