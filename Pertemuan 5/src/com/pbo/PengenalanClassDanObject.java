package com.pbo;

    // membuat class sebagai template

    class Mahasiswa {
        String nama;
        String NIM;
        String jurusan;
        double IPK;
        int umur;
    }

    public class PengenalanClassDanObject {

        public static void main(String[] args) throws Exception {

            // instansiasi / membuat object
            Mahasiswa mahasiswa1 = new Mahasiswa();
            mahasiswa1.nama = "Yanto";
            mahasiswa1.NIM = "2019071001";
            mahasiswa1.jurusan = "Teknik Perbengkelan";
            mahasiswa1.IPK = 3.9;
            mahasiswa1.umur = 19;

            System.out.println(mahasiswa1.nama);
            System.out.println(mahasiswa1.NIM);
            System.out.println(mahasiswa1.jurusan);
            System.out.println(mahasiswa1.IPK);
            System.out.println(mahasiswa1.umur);

            Mahasiswa mahasiswa2 = new Mahasiswa();
            mahasiswa2.nama = "Entis";
            mahasiswa2.NIM = "2017071001";
            mahasiswa2.jurusan = "Teknik Perbengkelan";
            mahasiswa2.IPK = 3.7;
            mahasiswa2.umur = 20;

            System.out.println(mahasiswa2.nama);
            System.out.println(mahasiswa2.NIM);
            System.out.println(mahasiswa2.jurusan);
            System.out.println(mahasiswa2.IPK);
            System.out.println(mahasiswa2.umur);
        }
    }