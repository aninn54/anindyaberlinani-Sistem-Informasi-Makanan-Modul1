package pkgpublic.pkgclass.anindya.pkg07162;
import java.util.Scanner;
import java.util.ArrayList;
public class PublicClassAnindya07162 {
    static Scanner input = new Scanner (System.in);
    static ArrayList<anindyaEntity>datamakanan = new ArrayList();
   
    static void anindya07162_makanan()
    {
        System.out.print("Inputkan Nama = ");
        String anindya07162_nama = input.next();
        System.out.print("Inputkan jumlah pesanan = ");
        String anindya07162_pesan = input.next();
        System.out.print("Inputkan makanan = ");
        String anindya07162_makanan = input.next();
        System.out.print("Inputkan harga = ");
        String anindya07162_harga = input.next();
        datamakanan.add(new anindyaEntity(anindya07162_nama,anindya07162_pesan,anindya07162_makanan,anindya07162_harga)); 
    }
    static void anindya07162_view()
    {
         for(int i=0;i<datamakanan.size();i++)
         {
             System.out.println("Nama = "+datamakanan.get(i).getanindya07162_nama());
             System.out.println("Jumlah pesanan = "+datamakanan.get(i).getanindya07162_pesan());
             System.out.println("Makanan = "+datamakanan.get(i).getanindya07162_makanan());
             System.out.println("Harga = "+datamakanan.get(i).getanindya07162_harga());
             System.out.println("__________________________________________________");
         } 
            
         }
   
   static int carimakanan(String anindya07162_nama)
    {
        int indexmakanan = -1;
        for(int i=0;i<datamakanan.size();i++)
        {
            if(anindya07162_nama.equals(datamakanan.get(i).getanindya07162_nama()))
            {
                indexmakanan = 1;
            }
        }
        return indexmakanan;
}
    static void anindya07162_hapus(String anindya07162_nama)
    {
        datamakanan.remove(carimakanan(anindya07162_nama));
        System.out.println(" Data telah di Hapus = ");
        System.out.println("______________________________________");
    }

    static void anindya07162_update(String anindya07162_nama,String anindya07162_makanan,String anindya07162_harga)
    {
        for(int i=0;i<datamakanan.size();i++)
        {
            {
                datamakanan.get(i).anindya07162_nama=anindya07162_nama;
                datamakanan.get(i).anindya07162_makanan=anindya07162_makanan;
                datamakanan.get(i).anindya07162_harga=anindya07162_harga;
                System.out.println("Data Telah di Update");
            }
            
        }
    }
 public static void main(String[] args) {
        System.out.println(" SELAMAT DATANG !!");
        System.out.println("_________________________________");
        int pil;
        do{
            System.out.println("1. Input Makanan");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");
            System.out.println("Pilih = ");
            pil = input.nextInt();
            System.out.println("_____________________________________________");
            switch(pil){
                case 1 : anindya07162_makanan();
                break;
                case 2 : anindya07162_view();
                break;
                case 3 : System.out.print(" Data Yang Di Hapus ");
                         String anindya07162_nama = input.next();
                         anindya07162_hapus(anindya07162_nama);
                break;
                case 4 : System.out.print(" Inputkan nama = ");
                         anindya07162_nama = input.next();
                         System.out.print("Inputkan menu makanan = ");
                         String anindya07162_makanan = input.next();
                         System.out.print("Inputkan Harga = ");
                         String anindya07162_harga = input.next();
                         anindya07162_update( anindya07162_nama,anindya07162_makanan,anindya07162_harga);
                break;
            }
            System.out.println("________________________________________________");
        }while(pil!=5);
    }
}

