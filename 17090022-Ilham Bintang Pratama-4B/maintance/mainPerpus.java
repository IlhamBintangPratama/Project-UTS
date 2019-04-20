package maintance;

import entity.*;
import java.util.*;

public class mainPerpus{
    private static List<perpus> data = new LinkedList<perpus>();
    public void tambahData(perpus prps){
        mainPerpus.data.add(prps);
        System.out.println("data telah tersimpan");
    }
    public void ubahData(perpus prps){
        int result = data.indexOf(prps);
        if(result >= 0){
            data.set(result, prps);
            System.out.println("Data telah berubah");
        }
    }
    public void hapusData(String kode_buku){
        int idx = data.indexOf(new perpus(kode_buku, "","","","",""));
        if(idx >= 0){
            data.remove(idx);
            System.out.println("Data telah terhapus");
        }else{
            System.out.println("Datanya memang tidak ada");
        }
    }
    public void cetakData(){
        System.out.println("--- cetak data");
        int i=1;
        for (perpus prps : data){
            System.out.println("data ke-" + i++);
            System.out.println("kode buku : " + prps.getKode_buku());
            System.out.println("judul buku : " + prps.getJudul_buku());
            System.out.println("pengarang : " + prps.getPengarang());
            System.out.println("penerbit : " + prps.getPenerbit());
            System.out.println("tahun : " + prps.getTahun());
            System.out.println("jumlah : " + prps.getJumlah());
        }
    }
}