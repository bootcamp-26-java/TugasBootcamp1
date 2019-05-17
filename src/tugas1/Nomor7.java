/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import static java.lang.Boolean.TRUE;
import java.util.Random;

/**
 * Tugas Bootcamp Algoritma
 * Random Characters
 */
public class Nomor7 {
    /**
     * varibel karakter untuk menyimpan string alfabet A-Z, a-z dan 0-9
     */
    String karakter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvxyz"
            + "0123456789";
    
    /**
     * Method untuk menampilkan random karakter alpha numeric
     * @param n jumlah karakter random yang dinginkan
     * @param unique boolean untuk menset jika TRUE akan menampilkan random tanpa perulangan di setiap karakter
     * jika FALSE akan memberikan random alpha numeric biasa sesuai jumlah yang diinginkan
     * @return memberikan nilai kembalian String berupa random alpha numeric
     */
    public String getRandom(int n, boolean unique) {
        String random = "";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        if (n < 99) {
            if (unique == TRUE) {
                System.out.println("Unique equals true not ready implemented, use false instead ;D");
            } else {
                while (salt.length() < n) { // length of the random string.
                    int index = (int) (rnd.nextFloat() * karakter.length());
                    salt.append(karakter.charAt(index));
                }
                random = salt.toString();
            }
        } else {
            System.out.println("Maaf angka tidak boleh lebih dari 100");
        }

        return random;
    }

    public static void main(String[] args) {
        Nomor7 fungsi = new Nomor7();
        System.out.println(fungsi.getRandom(20, false));
    }
}
