package com.pboreg;

import java.util.Scanner;

public class Tugas_Login {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String username;
            String password;
            int nilaii=0;

            System.out.println("Masukan Username & Password Anda");

            for (int i =0 ; i<= 2 ; i++) {

                nilaii=i+1;
                System.out.print("Username: ");
                username =input.next();
                System.out.print("Password: ");
                password =input.next();

                if ("shanbskr".equals(username) &&("ihsanbas".equals(password))) {
                    System.out.println("Hallo Selamat Datang Di Halamn Ini. " + username);
                    break;
                }
                else {
                    System.out.println("Login Gagal Username / Password Salah");
                }
                if (nilaii >=3) {
                    System.out.println("Anda Telah Di Banned, Silahkan Coba Lagi!!");
                }
            }
        }
    }