package tugas.uts;
import java.util.Scanner;
public class MesinKasir{
    public static void main(String[] args) {
         int jlh_data,pilihan,total,bayar,total1,harga = 0;//deklarasi integer
   
        String namamakanan;
        Scanner input = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("*         Toko Pak Andi          *");
        System.out.println("* Menyediakan Barang sehari hari *");
        System.out.println("**********************************");
        System.out.println("Kami Menjual Sembako");
        
        System.out.println(" 1. Beras          = Rp 20000/kg ");
        System.out.println(" 2. Tepung         = Rp 5000/kg  ");
        System.out.println(" 3. Gula           = Rp 10000/kg ");
        System.out.println(" 4. Minyak Goreng  = Rp 12000/liter ");
        System.out.print("Masukkan jenis sembako : ");
        pilihan = input.nextInt();
        if(pilihan == 1){
             harga = 20000;
            System.out.println();      
        }else if(pilihan == 2){
            harga = 5000;
            System.out.println();
        }else if(pilihan == 3){
            harga = 10000;
            System.out.println();
        }else if(pilihan == 4){
            harga = 12000;
            System.out.println();
        }else{
            System.out.println("Maaf Pilihan yang Anda Pilih Salah !");
        }
        System.out.print("Masukkan jumlah yang akan dibeli : ");
        jlh_data = input.nextInt();
            total = harga * jlh_data; 
            System.out.println("Total Pembelian : Rp. " + total);
            
         }
    }
   
