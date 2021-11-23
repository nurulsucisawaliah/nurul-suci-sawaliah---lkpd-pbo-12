/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class RentalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String id_member;
        waktu time = new waktu( );
        data data = new data();
        Scanner key = new Scanner(System.in);
        DateTimeFormatter DTF = DateTimeFormatter.BASIC_ISO_DATE;
        
        data.addMember(new membership("M001", "Mr. X Mr. Y", "Silver"));
        data.addMember(new membership("M002", "Mr. Y", "Gold"));
        data.addMember(new membership("M003", "Mr. Z", "Platinum"));
        
        System.out.print("Masukkan ID Member  : ");
        id_member = key.nextLine();
        time.peminjaman();
        time.pengembalian();
        
        //Output
        System.out.println("=============== Output =================");
        data.search(id_member.toUpperCase());
        
        LocalDate pinjaman = LocalDate.of(time.tahunPeminjaman, time.bulanPeminjaman, time.tanggalPeminjaman);
        String pFormat = pinjaman.format(DTF);
        LocalDate parsed_pinjaman = LocalDate.parse(pFormat, DTF);
        
        LocalDate kembali = LocalDate.of(time.tahunKembali, time.bulanKembali, time.tanggalKembali);
        String kFormat = pinjaman.format(DTF);
        LocalDate parsed_kembali = LocalDate.parse(kFormat, DTF);
        
        long jangkawaktu = ChronoUnit.DAYS.between(pinjaman, kembali);
        
        System.out.println("Tanggal Pinjam  : " + parsed_pinjaman );
        System.out.println("Tanggal Kembali : " + parsed_kembali);
        System.out.println("Lama Penyewaan  : " + jangkawaktu + " hari");
        
        int index = -1;
        for(int i = 0; i < data.dataMember.size(); i++){
            if(data.dataMember.get(i).idMember.equals(id_member)){
                index = i;
                switch(data.dataMember.get(i).jenisMember){
                    case "Silver":
                        silver Silver = new silver();
                        Silver.Benefit1(jangkawaktu);
                        Silver.Benefit2(jangkawaktu);
                        break;
                    case "Gold":
                        gold Gold = new gold();
                        Gold.Benefit1(jangkawaktu);
                        Gold.Benefit2(jangkawaktu);
                        Gold.Benefit3();
                        break;
                    case "Platinum":
                        platinum Platinum = new platinum();
                        Platinum.Benefit1(jangkawaktu);
                        Platinum.Benefit2(jangkawaktu);
                        Platinum.Benefit3();
                        Platinum.Benefit4(jangkawaktu);
                        break;
                    default:
                        System.out.println("eror!");
                        break;
                }
            }
        }
    }
    
}
