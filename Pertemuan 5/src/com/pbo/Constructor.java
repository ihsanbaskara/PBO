package com.pbo;

    // class tanpa constructor / class polos
    class Polos {
        String dataString;
        int dataInteger;
    }

    // class dengan constructor
    class Mahasiswa2 {
        String nama;
        String NIM;
        String jurusan;

        Mahasiswa2(String inputNama, String inputNIM, String inputJurusan) {
            nama = inputNama;
            NIM = inputNIM;
            jurusan = inputJurusan;

            System.out.println(nama);
            System.out.println(NIM);
            System.out.println(jurusan);
        }
    }
    public class Constructor {

        public static void main(String[] args) throws Exception {

            Mahasiswa2 mahasiswa1 = new Mahasiswa2("Yanto","2019071001","Teknik Perbengkelan");
            Mahasiswa2 mahasiswa2 = new Mahasiswa2("Entis","2017071001","Teknik Perbengkelan");

        }
    }