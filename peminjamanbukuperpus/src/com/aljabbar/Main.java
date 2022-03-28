package com.aljabbar;
import java.util.Scanner;

class Buku {
    String kodeBuku, judulBuku;

    Scanner in = new Scanner(System.in);

    Buku(String kb, String jb) {
        kodeBuku = kb;
        judulBuku = jb;
    }

    void setKb() {
        System.out.println("Masukkan Kode Buku = ");
        kodeBuku = in.nextLine();
    }

    void setJb() {
        System.out.println("Masukkan Judul buku = ");
        judulBuku = in.nextLine();
    }

    String takeKb(){
        return kodeBuku;
    }

    String takeJb(){
        return judulBuku;
    }

}


class Peminjam {
    String nama, nik, tgl;

    Scanner in = new Scanner(System.in);

    Peminjam(String inputnama, String inputnik, String inputtgl) {
        nama = inputnama;
        nik = inputnik;
        tgl = inputtgl;
    }

    void setNama() {
        System.out.println("Masukkan Nama Peminjam = ");
        nama = in.nextLine();
    }

    void setNik() {
        System.out.println("Masukkan NIK Peminjam = ");
        nik = in.nextLine();
    }

    void setTgl() {
        System.out.println("Masukkan Tanggal Meminjam = ");
        tgl = in.nextLine();
    }

    String takeNama(){
        return nama;
    }
    String takeNik()  {return nik; }
    String takeTgl() {return tgl; }

}

public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String[] data = new String[5];

            Buku Book = new Buku("0", "0");
            Peminjam Pinjam = new Peminjam("0", "0","0");

            Scanner in = new Scanner(System.in);


            String tambah;
            do{
                Book.setKb();
                Book.setJb();
                Pinjam.setNama();
                Pinjam.setNik();
                Pinjam.setTgl();

                String kode = Book.takeKb();
                String judul = Book.takeJb();
                String NIK = Pinjam.takeNik();
                String nama = Pinjam.takeNama();
                String TGL = Pinjam.takeTgl();
                dataBuku(kode, judul, NIK, nama, TGL);
                display();

                System.out.println();
                System.out.print("apakah anda ingin meminjam buku lagi (y/n) : ");
                tambah = scan.nextLine();
            }while( tambah.equals("y") || tambah.equals("Y")  );

        }

        static String array[] = new String[100];
        static int i = 0;
        static void dataBuku(String kode, String judul, String NIK, String nama, String TGL){
            array[i] = kode + " --- " +  judul + " --- " + nama + " --- " + NIK + " --- " + TGL ;
            i++;
        }

        static void display(){
            System.out.println();
            System.out.println("Kode --- Judul --- Nama --- NIK --- TGL");
            for( int j = 0 ; j < i ; j++){
                System.out.println(array[j]);
            }
        }
    }

