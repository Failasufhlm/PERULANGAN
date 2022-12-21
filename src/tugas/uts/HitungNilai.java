package tugas.uts;
import java.util.Scanner;

public class HitungNilai {


    public static void main(String[] args) {
        // TODO code application logic here
        String nama, NIM;
        int nilai;
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        nama = masukkan.nextLine();
        System.out.print("Masukkan NIM : ");
        NIM = masukkan.nextLine();
        System.out.print("Masukkan Nilai yang didapat : ");
        nilai = masukkan.nextInt();
        if(nilai > 90&& nilai <=100) {
            System.out.println("\n Grade : A");
    }
        else if(nilai > 81&& nilai <=90){
            System.out.println("\n Grade : B");
    }
        else if (nilai > 50&& nilai <=80){
            System.out.println("\n Grade : E");
        }
        
    }
    
}
