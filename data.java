/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class data {
    ArrayList<membership> dataMember = new ArrayList<membership>();
    
    void addMember(membership data){
        this.dataMember.add(data);
    }
    
    void search(String id){
        boolean find =false;
        int index = -1;
        for(int i = 0 ; i < this.dataMember.size();i++){
            if(this.dataMember.get(i).idMember.equals(id)){
                index = i;
                find = true;
            }
        }
        if (find == true){
            this.dataMember.get(index).printMembership();
        }else{
            System.out.println("tidak ditemukan");
            System.out.println(0);
        }
    }
}
