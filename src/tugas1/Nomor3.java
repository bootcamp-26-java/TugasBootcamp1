/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sekar Ayu Safitri
 */
public class Nomor3 {

    public static void main(String[] args) {

        System.out.println("Deret Bilangan Prima");
        Integer mLimit = 100;
        ArrayList<Integer> listPrima = prima(mLimit);
        System.out.print(listPrima);

        System.out.println("\n");
        List<Integer> fibonacciList = fibo(9);
        System.out.println("Deret Fibonacci");
        System.out.println(fibonacciList);
    }

    /**
     * class Algoritma berisi dua buah fungsi yaitu Prima dan Fibonacci
     *
     * @param limit merupakan batasan dari deret bilangan prima yaitu 100
     * @return berupa arrayList dari deret bilangan prima
     */
    public static ArrayList<Integer> prima(int limit) {

        ArrayList<Integer> listPrima = new ArrayList<Integer>();
        boolean isPrima; //pengecekan bilangan prima atau bukan

        for (int i = 2; i <= limit; i++) {

            isPrima = true; //bilangan prima

            for (int j = 2; j < i; j++) {
                if (i % j == 0) { //pengecekan mod untuk melihat angka yang habis dibagi dengan angka dibawahnya
                    isPrima = false; //bukan bilangan prima
                    break; //end
                }
            }

            if (isPrima) {
                listPrima.add(i); //masukkan ke dalam ArrayList
            }
        }

        return listPrima;
    }

    /**
     * Mencetak deret Fibonacci dengan dari 0 sampai nilai yang mendekati
     * nilaimaksimal
     *
     * @param nilaimaks Parameter yang digunakan untuk membatasi nilai
     * deret. Merupakan parameter yang menentukan batas atas deret Fibonacci.
     * @return Pengembalian berupa list dari deret Fibonacci dari 0 sampai nilai
     * yang dekat dengan nilaimaksimal
     */
    /*
    Sindi
     */
    public static List<Integer> fibo(int nilaimaks) {
        List<Integer> fList = new ArrayList<>();
        int bil1 = 0, bil2 = 1, i = 2;
        fList.add(bil1);
        fList.add(bil2);
        while (i <= nilaimaks) {
            bil2 += bil1;
            if (bil2 <= nilaimaks) {
                fList.add(bil2);
                bil1 = bil2 - bil1;
            }
            i++;
        }
        return fList;
    }
}
