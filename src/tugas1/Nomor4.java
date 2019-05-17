package tugas1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Nomor4 {

    /**
     * author Dan! Method Pecah digunakan untuk menentukan pecahan uang
     * berdasarkan nominal
     *
     * @param uang merupakan nilai inputan
     * @return nilai kembalian dari method Pecah merupakan sisa berupa angka
     */
    public static int[][] Pecah(int uang) {
        int[][] result = new int[2][10];
        int[] pecah = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100}; //membuat array
        int jml;

        //looping untuk menghitung pecahan uang
        for (int i = 0; i < 10; i++) {
            jml = uang / pecah[i]; //menentukan jumlah lembar uang
            uang = uang - (pecah[i] * jml); //menentukan sisa uang
//            System.out.println("Uang Pecahan " + pecah[i] + " sebanyak " + jml+" lembar"); //menampilkan hasil
            result[0][i] = pecah[i];
            result[1][i] = jml;
        }

        return result; //nilai kembalian

    }

    ///**
    // *
    // * @author erik
    // */
    /**
     *
     * @param limit berfungsi untuk menentukan jumlah maksimal dari variabel
     * limit yang nantinya dilakukan looping untuk mengisi arraylist
     * @return digunakan untuk mengembalikan nilai looping ke dalam arraylist
     * list
     */
    public static ArrayList<Integer> prima(int limit) {
        // create array list object       
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= limit; i++) {
            //populating the list
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package randomnumber;
//import java.util.Random;
//

    public static void main(String[] args) {
        int[][] result = Pecah(377000);
        for (int i = 0; i < 10; i++) {
            System.out.println("Uang Pecahan " + result[0][i] + " sebanyak " + result[1][i] + " lembar"); //menampilkan hasil
        }
        System.out.println(Pecah(176600)); //membuat masukan

        Nomor4 nomor4 = new Nomor4();
        //Printing 10 unique random number
        System.out.print(nomor4.prima(10));
    }
}
/**
 * author Erick Arraylist digunakan untuk menympan data array dimana jumlah
 * array tidak terhingga/tidak mempunyai batas
 *
 *
 */
