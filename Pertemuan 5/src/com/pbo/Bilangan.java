package com.pbo;

 class Bilangan {
     private int a = 10;
     private int b = 20;
     private int c = 30;

     //method
     public int tampilkana() {
         return this.a;
     }

     public int tampilkanb() {
         return this.b;
     }

     public int tampilkanc() {
         return this.c;
     }

     public void inputa(int nilai) {
         this.a = nilai;
     }

     public void inputb(int nilai) {
         this.b = nilai;
     }

     public void inputc(int nilai) {
         this.c = nilai;
     }

     public int tambah() {
         int hasil = this.a + this.b + this.c;
         return hasil;
     }

     public int kurang() {
         int hasil = this.c - this.a;
         return hasil;
     }

     public int kali() {
         int hasil = this.b * this.c;
         return hasil;
     }

     public double bagi() {
         double hasil = (double) this.c / (double) this.a;
         return hasil;
     }
 }
