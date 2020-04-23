}

Lengkapi kode di dalam main menjadi seperti ini:
package com.dicoding.javafundamental.bangundatar;
 
import java.util.Scanner;
 
public class Main {
 
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
 
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
 
        /*Program*/
        //panggil metode
        mainMenu();
        //kondisional untuk pilihan menu yang dimasukan
        switch(pilihan){
            case '1':{
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1,s2));
         

Academy
Challenge
Event
Job
Developer
Beranda
Academy
Memulai Pemrograman Dengan Java
Studi Kasus: Bangun Datar
Program BangunDatar
Program yang terakhir adalah menghitung luas dan keliling dari bangun datar. Kali ini kita akan mencoba menggunakan konsep atau paradigma OOP agar lebih mudah dalam proses pemrogramannya. Anda  membuat interface bangun datar agar dapat mengmplementasikannya pada setiap kelas bangun datar yang akan dibuat.

Untuk studi kasus, kita bisa membuat project baru dan beri nama BangunDatar. Selanjutnya buatlah package di dalamnya dengana nama com.dicoding.javafundamental.bangundatar.
20190722195413531cc012584e45ef496dc8d36222d491
Studi kasus pertama ini cukup mudah. Kita buat kelas interface baru dan beri nama BangunDatar. Kemudian tambahkanlah kode berikut:
package com.dicoding.javafundamental.bangundatar;
 
public interface BangunDatar {
    public double luas(int s1, int s2);
    public double keliling(int s1, int s2);
}

Buatlah kelas baru dengan nama PersegiPanjang. Kemudian implementasikan interface BangunDatar dengan mendeklarasikan setiap fungsi yang ada pada interface tersebut. Karena ini adalah implements maka tambahkan juga  statement isi fungsinya.
package com.dicoding.javafundamental.bangundatar;
 
public class PersegiPanjang implements BangunDatar {
 
    PersegiPanjang() {
    }
    @Override
    public double luas(int s1, int s2) {
        return (s1 * s2);
    }
    @Override
    public double keliling(int s1, int s2) {
        return (2 * (s1 + s2));
    }
}

Buatlah kelas yang lain dengan nama SegitigaSiku. Implementasikan juga interface-nya
package com.dicoding.javafundamental.bangundatar;
 
public class SegitigaSiku implements BangunDatar {
    SegitigaSiku() {
    }
    @Override
    public double luas(int s1, int s2) {
        return (0.5 * s1 * s2);
    }
    @Override
    public double keliling(int s1, int s2) {
        return (s1 + s2 + Math.sqrt((s1 * s1) + (s2 * s2)));
    }
}

Buatlah kelas Lingkaran, kemudian implementasikan interface kembali. Pada kelas Lingkaran ini, kita juga mencoba untuk menerapkan metode overload karena rumus menghitung luas dan keliling pada lingkaran cukup dengan satu parameter saja yaitu jari-jari.
package com.dicoding.javafundamental.bangundatar;
 
public class Lingkaran implements BangunDatar {
    private double pi = 3.1415;
    Lingkaran() {
    }
    @Override
    public double luas(int s1, int s2) {
        return 0;
    }
    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }
    public double luas(int r) { //metode overload
        return (pi * r * r);
    }
    public double keliling(int r) { //methode overload
        return (2 * pi * r);
    }
}

Terakhir buat kelas Main untuk menjalankan program. Pada kelas ini kita instansiasi kelas setiap bangun datar.
package com.dicoding.javafundamental.bangundatar;
 
public class Main {
    public static void main(String[] args) {
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
    }
}

Kita buat metode mainMenu. Metode ini digunakan untuk menampilkan pilihan menu.
package com.dicoding.javafundamental.bangundatar;
 
import java.util.Scanner;
 
public class Main {
 
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
 
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
    }
 
    private static void mainMenu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}

Lengkapi kode di dalam main menjadi seperti ini:
package com.dicoding.javafundamental.bangundatar;
 
import java.util.Scanner;
 
public class Main {
 
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*Kamus*/
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;
 
        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
 
        /*Program*/
        //panggil metode
        mainMenu();
        //kondisional untuk pilihan menu yang dimasukan
        switch(pilihan){
            case '1':{
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1,s2));
                break;
            }
            case '2':{
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + osegitiga.keliling(s1,s2));
                break;
            }
            case '3':{
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                break;
            }
            default :{
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }       break;

private static void mainMenu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
