package LatihanPercabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class percabangan {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader
                (System.in));
    //if-else
    //cek syarat pembuatan KTP
    int usia=0;
        System.out.print("Masukan Usia Anda : ");
        usia = Integer.parseInt(br.readLine());
    if (usia >= 17){
        System.out.println("Sudah Memenuhi Syarat");
    } else {
        System.out.println("Usia anda belom memenuhi persyaratan ");
    }
    //if-else-if
    //cek status kelulusan MK
        String nim;
    int nilaiUas;
        System.out.print("Masukan Nim Anda : ");
        nim = br.readLine();
        System.out.print("masukan nilai anda : ");
        nilaiUas = Integer.parseInt(br.readLine());

        //jika nilai 80,70,65 = lulus, di bawah 65 tidak lulus
        if (nim.equalsIgnoreCase("22410100046") && nilaiUas == 80){
            System.out.println("LULUS");
        }else if (nim.equalsIgnoreCase("22410100046") && nilaiUas == 65){
            System.out.println("LULUS");
        }else if (nim.equalsIgnoreCase("22410100046") && nilaiUas == 65){
            System.out.println("TIDAK LULUS");
        }else if (nim.equalsIgnoreCase("22410100046") && nilaiUas == 50){
            System.out.println("YO JELAS GALULUS DEK");
        }



    //nested if
    //cek menu yang di pilih (makanan/miniman)
        String menu, jenis;
        System.out.println("Masukan Makanan Atau Minuman : ");
        menu = br.readLine();
        System.out.println("Masukan Jenis Menu \n Masukan : Snack, Nasi Bungkus \n" +
                "Minuman : Kopi, Esteh");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("makanan")){
            if (jenis.equalsIgnoreCase("snack"))
                System.out.println("Harga 2000");
        } else if (jenis.equalsIgnoreCase("Nasi Bungkus")) {
            System.out.println("harga 5000");

        } else if (menu.equalsIgnoreCase("minuman")){
            if (jenis.equalsIgnoreCase("Kopi"))
                System.out.println("harga 3000");
        } {
            if (jenis.equalsIgnoreCase("EsTeh"))
                System.out.println("Harga 5000");


        }
        {
        }


    }
}
