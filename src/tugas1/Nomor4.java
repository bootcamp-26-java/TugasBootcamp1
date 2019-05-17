package tugas1;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        int[][] result = Pecah(377000);
        for (int i = 0; i < 10; i++) {
            System.out.println("Uang Pecahan " + result[0][i] + " sebanyak " + result[1][i] + " lembar"); //menampilkan hasil
        }

//        System.out.println(Pecah(176600)); //membuat masukan
        /**
         * author Erick Arraylist digunakan untuk menympan data array dimana
         * jumlah array tidak terhingga/tidak mempunyai batas
         *
         *
         */
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            //populating the list
            list.add(i);
        }

        // shuffling the list
        System.out.println("---------------------------------------------------------------------");
        Collections.shuffle(list);
        System.out.println("10 angka random dari 1 sampai 10:\n--------------------------------");
        for (int i = 1; i <= 10; i++) {
            //Printing 10 unique random number
            System.out.print(list.get(i) + (i <= 10 ? "," : "selesai"));
        }
    }

}
