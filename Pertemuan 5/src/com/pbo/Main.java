package com.pbo;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Bilangan obil = new Bilangan();
        System.out.println("Nilai a = " + obil.tampilkana());
        System.out.println("Nilai b = " + obil.tampilkanb());
        System.out.println("Nilai c = " + obil.tampilkanc());

        //nilai a diinput
        obil.inputa(100);
        System.out.println("Nilai a setelah di input = " +obil.tampilkana());
        //nilai b diinput
        obil.inputb(200);
        System.out.println("Nilai b setelah di input = " +obil.tampilkanb());
        //nilai c diinput
        obil.inputc(300);
        System.out.println("Nilai c setelah di input = " +obil.tampilkanc());

        //panggil method tambah()
        System.out.println("Hasil Pertambahan = " +obil.tambah());

        //panggil method kurang()
        System.out.println("Hasil Pengurangan = " +obil.kurang());

        //panggil method kali()
        System.out.println("Hasil Perkalian = " +obil.kali());

        //panggil method bagi()
        System.out.println("Hasil Pembagian = " +obil.bagi());
    }
}
