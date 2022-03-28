import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class tugas {//deklarasi kelas main
public static void main(String[] args) {
        
//deklarasi variabel
int menu;
String nama;
try (//deklarasi input
Scanner pilihMenu = new Scanner(System.in)) {
try (Scanner inputNama = new Scanner(System.in)) {
//deklarasi queue
Queue<String> namaBuku= new LinkedList<>();
Queue<String> pengarangBuku= new LinkedList<>();
Queue<String> penerbitBuku= new LinkedList<>();

LinkedList<String> id_Buku= new LinkedList<>();
LinkedList<String> nama_Buku= new LinkedList<>();
LinkedList<String> penerbit_Buku= new LinkedList<>();
LinkedList<String> pengarang_Buku= new LinkedList<>();

                

System.out.println("\n\t\t=======================================================================================");
System.out.println("\t\t\t\t\t\t           PERPUSTAKAAN");
System.out.println("\t\t=======================================================================================");
                
do{//deklarasi do
System.out.println("\n\n");
System.out.println("\t\t\t\t==============================");
System.out.println("\t\t\t\t\t  PILIH MENU  ");
System.out.println("\t\t\t\t==============================");
System.out.println("\t\t\t\t1. Input data buku");
System.out.println("\t\t\t\t2. Input ID buku");
System.out.println("\t\t\t\t3. Lihat data buku");
System.out.println("\t\t\t\t4. Keluar");
System.out.println("\t\t\t\t==============================");
System.out.print("\t\t\t\t     Pilihan : ");
menu=pilihMenu.nextInt();
System.out.println("\n");

if(menu==1){//input data buku
System.out.print("\t\t\t\tMasukan judul buku         : ");
nama = inputNama.nextLine();
namaBuku.add(nama);
//System.out.print("\t\t\t\tMasukan ID buku            : ");
//nama = inputNama.nextLine();
//idBuku.add(nama);
System.out.print("\t\t\t\tMasukan nama pengarang     : ");
nama = inputNama.nextLine();
pengarangBuku.add(nama);
System.out.print("\t\t\t\tMasukan nama penerbit      : ");
nama = inputNama.nextLine();
penerbitBuku.add(nama);


}else if(menu==2){//Id buku
    if(namaBuku.isEmpty()){
    System.out.println("\t\t\t\tCEK KEMBALI ID BUKU!!");
    }else{
    System.out.print("\t\t\t\tMasukan ID buku   "+namaBuku.peek()+"         : ");
    nama = inputNama.nextLine();
    id_Buku.add(nama);
    System.out.println("\t\t\t\tNOTICE!!");
    nama_Buku.add(namaBuku.poll());
    pengarang_Buku.add(pengarangBuku.poll());
    penerbit_Buku.add(penerbitBuku.poll());
    

}
}else if(menu==3){//Lihat data buku
if(nama_Buku.isEmpty()){
System.out.println("\t\t\t\tTIDAK ADA DATA DITEMUKAN!!");
}else{
                            
System.out.println("\t\t\t\t==============================");
System.out.println("\t\t\t\t         DATA BUKU");
System.out.println("\t\t\t\t==============================");
int i = 0;
do{
    System.out.println("\t\t\t\t"+(i+1)+".\t"+id_Buku.get(i)+"\t"+nama_Buku.get(i)+"\t"+pengarang_Buku.get(i)+"\t"+penerbit_Buku.get(i));    
    i++;
}while(i < nama_Buku.size());
/*
System.out.println("\t\t\t\t|| ID              : "+id_Buku);
System.out.println("\t\t\t\t|| JUDUL           : "+nama_Buku);
System.out.println("\t\t\t\t|| PENGARANG       : "+pengarang_Buku);
System.out.println("\t\t\t\t|| PENERBIT        : "+penerbit_Buku);
*/
System.out.println("\t\t\t\t==============================");
System.out.println("\t\t\t\t|| BUKU PERTAMA  : "+nama_Buku.peek());
System.out.println("\t\t\t\t|| TOTAL BUKU    : "+nama_Buku.size());
 }
}else{//jika memilih 4
 if(menu==4){
System.out.println("\n\t\t\t\t\t Terima Kasih");
                        }
                    }
                }while(menu!=4);//deklarasi while
            }
        }
    }
}      
