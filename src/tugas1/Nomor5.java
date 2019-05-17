/*
 * Arif Fridasari Mengerjakan bagian Method Decrement
 */
package tugas1;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Decrement merupakan class untuk fungsi auto decrement / pengurangan
 * nilai dari variabel a dan b variabel a adalah batas minimum / nilai akhir
 * dari pengurangan / decrement variabel b adalah nilai awal / batas atas akhir
 * dari decrement
 *
 * @author Arif Fridasari
 */
public class Nomor5 {

    public static void main(String[] args) {
        System.out.println("Auto Increment");
        List<String> inc = increment(2, 10);
        for (String string : inc) {
            System.out.println(string + ", ");
        }

        System.out.println("Auto Decrement");

        List<String> dec = decrement(3, 15);
        for (String string : dec) {
            System.out.print(string + ", ");
        }
    }

    /**
     * Sindi
     */
    
    /**
     * Auto increment dari nilai minimumA sampai dengan nilai maksimumB dengan
     * menambahkan left padding "0" sebanyak digit dari maksimumB sehingga semua
     * elemen increment memiliki length yang sama yaitu length dari maksimumB.
     *
     * @param minimumA Batas bawah nilai. Merupakan nilai terkecil dari list
     * increment
     * @param maksimumB Batas atas nilai. Merupakan nilai terbesar dari list
     * increment
     * @return Pengembalian berupa list nilai increment dari minimumA sampai
     * maksimumB
     */
    
    public static List<String> increment(int minimumA, int maksimumB) {
        List<String> inc = new ArrayList<>();
        for (int i = minimumA; i <= maksimumB; i++) {
            String output = Integer.toString(i);
            while (output.length() < Integer.toString(maksimumB).length()) {
                output = "0" + output;
            }
            inc.add(output);
        }
        return inc;
    }

    //Arif
    public static List<String> decrement(int a, int b) {
        List<String> dec = new ArrayList<>();
        for (int i = b; i >= a; i--) {
            String y = Integer.toString(i);
            while (y.length() < Integer.toString(b).length()) {
                y = "0" + y;
            }
            dec.add(y);
        }
        return dec;
    }
}